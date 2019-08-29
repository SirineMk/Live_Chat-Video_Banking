package com.proxym.bank.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proxym.bank.repositories.ClientRepository;
import com.proxym.bank.entities.Client;

import javax.validation.Valid;
import java.util.List;



@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Client> getAllClients() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Client getClientById(@PathVariable("id") ObjectId _id) {
        return repository.findBy_id(_id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyClientById(@PathVariable("id") ObjectId _id, @Valid @RequestBody Client client) {
        client.set_id(_id);
        repository.save(client);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Client createClient(@Valid @RequestBody Client client) {
        client.set_id(ObjectId.get());
        repository.save(client);
        return client;
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
    public void deleteClient(@PathVariable ObjectId _id) {
        repository.delete(repository.findBy_id(_id));
    }

}