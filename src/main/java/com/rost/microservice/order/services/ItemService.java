package com.rost.microservice.order.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rost.microservice.order.models.Item;
import com.rost.microservice.order.repositories.ItemRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public List<Item> index() {
        return itemRepository.findAll();
    }
}
