package com.makaia.modRegistro.microservicioRegistro.Publisher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PublisherConfigResultadosTest {
@Value("${microservicioRegistro.rabbit.queue.resultados}")
    private String name;
@Bean
    public QueueResultadosTest queueResul(){
    return new QueueResultadosTest(this.name);
}
}
