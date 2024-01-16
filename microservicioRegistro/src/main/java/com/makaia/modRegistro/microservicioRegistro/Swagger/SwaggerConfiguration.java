package com.makaia.modRegistro.microservicioRegistro.Swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Microservicio Registro API"
                ),
        servers = {
                @Server(url = "htpp://prueba/", description = "Servidor de produccion"),
                @Server(url = "htpp://localhost:8081/", description = "Servidor local")
                }
)

public class SwaggerConfiguration {
}
