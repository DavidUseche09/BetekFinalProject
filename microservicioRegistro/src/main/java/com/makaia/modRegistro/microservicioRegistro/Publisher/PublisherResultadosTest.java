package com.makaia.modRegistro.microservicioRegistro.Publisher;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
public class PublisherResultadosTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    private QueueResultadosTest queueResultadosTest;
    public void send(Long id){
        this.rabbitTemplate.convertAndSend(queueResultadosTest.getName());
    }

}
