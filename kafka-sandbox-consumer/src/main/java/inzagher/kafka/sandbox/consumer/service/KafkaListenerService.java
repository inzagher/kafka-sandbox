package inzagher.kafka.sandbox.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaListenerService {

    @KafkaListener(topics = "t-1", groupId = "gid-1")
    public void onMessageReceived(Message<Object> message) {
        log.info("Message received: " + message.getPayload());
    }
}
