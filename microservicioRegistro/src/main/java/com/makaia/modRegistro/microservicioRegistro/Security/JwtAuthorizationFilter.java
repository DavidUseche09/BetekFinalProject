package com.makaia.modRegistro.microservicioRegistro.Security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.makaia.modRegistro.microservicioRegistro.Entities.Roles;
import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtAuthorizationFilter  extends OncePerRequestFilter {
    private final JwtUtil jwtUtil;
    private final ObjectMapper mapper;

    public JwtAuthorizationFilter(JwtUtil jwtUtil, ObjectMapper mapper) {
        this.jwtUtil = jwtUtil;
        this.mapper = mapper;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        Map<String, Object> errorDetails = new HashMap<>();
        try{
            String accesToken = jwtUtil.resolveToken(request);
            if (accesToken == null){
                filterChain.doFilter(request,response);
                return;
            }
            System.out.println("token :"+accesToken);
            Claims claims = jwtUtil.resolveClaims(request);
            if (claims != null & jwtUtil.validateClaims(claims)){
                String email = claims.getSubject();
                String roles = claims.getSubject();
                System.out.println("email : "+ email);
                System.out.println("roles: "+ roles);
                Authentication authentication =
                        new  UsernamePasswordAuthenticationToken(email, "");
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }catch (Exception e){
            errorDetails.put("message", "Erro de autenticación");
            errorDetails.put("details", e.getMessage());
            response.setStatus(HttpStatus.FORBIDDEN.value());
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            mapper.writeValue(response.getWriter(), errorDetails);
        }
        filterChain.doFilter(request, response);
    }
}
