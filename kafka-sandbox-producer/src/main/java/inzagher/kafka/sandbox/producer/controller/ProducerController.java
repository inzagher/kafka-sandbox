package inzagher.kafka.sandbox.producer.controller;

import inzagher.kafka.sandbox.producer.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProducerController {
    private final KafkaService service;

    @PostMapping("/api/producer/send")
    public void send(@RequestBody Object message) {
        service.send(message);
    }
}
