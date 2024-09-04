package com.indoo.caravan.services;

import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CaravanService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener(topics = "shipping-arrange-topic", groupId = "depot-service-group")
    public void arrangeCaravan(String orderData) {
        System.out.println("Caravan order: " + orderData);
    }
}
