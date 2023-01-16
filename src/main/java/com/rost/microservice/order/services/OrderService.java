package com.rost.microservice.order.services;

import org.springframework.stereotype.Service;

import com.rost.microservice.order.models.Order;
import com.rost.microservice.order.repositories.OrderRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public Order save(Order saving) {
        var saved = orderRepository.save(saving);
        createOrder(saved);
        return saved;
    }

    private void createOrder(Order creating) {

    }
}
