package com.makaia.modRegistro.microservicioRegistro.Publisher;

import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


public class QueueAspirantes extends Queue {
    public QueueAspirantes(String name) {
        super(name);
    }
}
