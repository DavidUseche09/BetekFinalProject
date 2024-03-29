package com.makaia.modRegistro.microservicioRegistro.Publisher;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@EnableRabbit
public class PublisherAspirantes {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    private QueueAspirantes queueAspirantes;

    public void send(Long id){
        this.rabbitTemplate.convertAndSend(queueAspirantes.getName(), id);
    }

}
