package com.makaia.modRegistro.microservicioRegistro.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    private final CustomDetailService customDetailService;
    private final JwtAuthorizationFilter jwtAuthorizationFilter;

    public SecurityConfiguration(CustomDetailService customDetailService, JwtAuthorizationFilter jwtAuthorizationFilter) {
        this.customDetailService = customDetailService;
        this.jwtAuthorizationFilter = jwtAuthorizationFilter;
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(8);
    }
    @Bean
    public AuthenticationManager authenticationManager (HttpSecurity http, PasswordEncoder passwordEncoder)
        throws Exception{
        AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.userDetailsService(customDetailService).passwordEncoder(passwordEncoder);
        return authenticationManagerBuilder.build();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .authorizeRequests(authorize -> {
                    authorize.requestMatchers("api/v1/user/**").authenticated();
                    authorize.requestMatchers("api/v1/auth/**").permitAll();
                    authorize.requestMatchers("api/v1/aspirante/**").authenticated();
                })
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(sessionAuthenticationStrategy ->
                        sessionAuthenticationStrategy.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .addFilterBefore(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class)
                .authorizeRequests(authorize ->
                        authorize.requestMatchers( "/swagger-ui/**", "/swagger-ui.html").permitAll()
                );

        return http.build();
    }
}
