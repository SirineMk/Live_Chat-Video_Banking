package com.proxym.bank.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgentRepository extends MongoRepository<com.proxym.bank.entities.Agent, String> {
    com.proxym.bank.entities.Agent findBy_id(ObjectId _id);
}