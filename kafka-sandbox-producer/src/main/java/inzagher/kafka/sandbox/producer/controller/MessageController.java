package inzagher.kafka.sandbox.producer.controller;

import inzagher.kafka.sandbox.producer.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MessageController {
    private final KafkaProducerService service;

    @PostMapping("/api/messages/publish")
    public void publish(@RequestBody Object message) {
        service.publish(message);
    }
}
