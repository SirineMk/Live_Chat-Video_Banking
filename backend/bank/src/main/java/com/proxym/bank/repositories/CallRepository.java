package com.proxym.bank.repositories;

import com.proxym.bank.entities.Call;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CallRepository extends MongoRepository<Call, String> {
    com.proxym.bank.entities.Call findBy_id(ObjectId _id);
}