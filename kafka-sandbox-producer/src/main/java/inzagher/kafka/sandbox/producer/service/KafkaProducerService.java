package inzagher.kafka.sandbox.producer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaProducerService {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void publish(Object data) {
        Message<Object> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "t-1")
                .build();
        log.info("Publishing message: " + data);
        kafkaTemplate.send(message);
    }
}
