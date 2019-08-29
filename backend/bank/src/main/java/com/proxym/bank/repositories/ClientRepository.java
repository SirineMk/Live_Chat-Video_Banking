package com.proxym.bank.repositories;

        import org.bson.types.ObjectId;
        import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<com.proxym.bank.entities.Client, String> {
    com.proxym.bank.entities.Client findBy_id(ObjectId _id);
}