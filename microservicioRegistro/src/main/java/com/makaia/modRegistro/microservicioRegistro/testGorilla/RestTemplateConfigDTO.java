package com.makaia.modRegistro.microservicioRegistro.testGorilla;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfigDTO {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
