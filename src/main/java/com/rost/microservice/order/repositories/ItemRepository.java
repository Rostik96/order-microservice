package com.rost.microservice.order.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rost.microservice.order.models.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
}
