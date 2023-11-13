package com.ms.email.consumers;

import com.ms.email.dtos.EmaiRecordDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmaiRecordDto emaiRecordDto) {
        System.out.println(emaiRecordDto.emailTo());
    }
}
