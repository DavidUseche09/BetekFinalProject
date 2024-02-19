package com.makaia.modRegistro.microservicioRegistro.Swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@SecurityScheme(
        // JWT configuration
        type = SecuritySchemeType.HTTP,
        name = "BearerAuth",
        scheme = "bearer",
        bearerFormat = "JWT"
)
@OpenAPIDefinition(
        info = @Info(
                title = "Microservicio Registro API"
        ,description = "Esta aplicación fue diseñada en el marco del proyecto integrador del" +
                " Bootcamp de backend de Makaia como resultado de la implementación de los conocimientos adquiridos en la formación académica.")

        ,
        servers = {
        		@Server(url="http://microservicioregistrobetek-env.eba-ibstm6u8.us-east-2.elasticbeanstalk.com/",description="Servidor de Producción"),
                @Server(url = "http://localhost:8081/", description = "Servidor local")
                }
)
public class SwaggerConfiguration {
}
