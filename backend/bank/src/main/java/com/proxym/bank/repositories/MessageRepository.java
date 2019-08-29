package com.proxym.bank.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<com.proxym.bank.entities.Message, String> {
    com.proxym.bank.entities.Message findBy_id(ObjectId _id);
}