package com.makaia.modRegistro.microservicioRegistro.Publisher;

import org.springframework.amqp.core.Queue;

public class QueueResultadosTest  extends Queue {
    public QueueResultadosTest(String name) {
        super(name);
    }
}
