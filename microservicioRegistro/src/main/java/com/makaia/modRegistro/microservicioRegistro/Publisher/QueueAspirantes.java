package com.makaia.modRegistro.microservicioRegistro.Publisher;

import org.springframework.amqp.core.Queue;

public class QueueAspirantes extends Queue {
    public QueueAspirantes(String name) {
        super(name);
    }
}
