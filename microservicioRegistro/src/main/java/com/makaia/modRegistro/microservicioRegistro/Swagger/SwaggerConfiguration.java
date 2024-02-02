package com.makaia.modRegistro.microservicioRegistro.Swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@SecurityScheme(
//        // JWT configuration
//        type = SecuritySchemeType.HTTP,
//        name = "BearerAuth",
//        scheme = "bearer",
//        bearerFormat = "JWT"
//)
//@OpenAPIDefinition(
//        info = @Info(
//                title = "Microservicio Registro API"
//                ),
//        servers = {
//                @Server(url = "htpp://prueba/", description = "Servidor de produccion"),
//                @Server(url = "htpp://localhost:8081/api/v1/", description = "Servidor local")
//                }
//)
//@Configuration
//@EnableSwagger2
//public class SwaggerConfiguration {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
//    }
//}