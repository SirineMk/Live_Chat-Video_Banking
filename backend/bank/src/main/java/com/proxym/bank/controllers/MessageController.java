package com.proxym.bank.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proxym.bank.repositories.MessageRepository;
import com.proxym.bank.entities.Message;

import javax.validation.Valid;
import java.util.List;



@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Message> getAllMessages() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Message getMessageById(@PathVariable("id") ObjectId _id) {
        return repository.findBy_id(_id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyMessageById(@PathVariable("id") ObjectId _id, @Valid @RequestBody Message message) {
        message.set_id(_id);
        repository.save(message);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Message createMessage(@Valid @RequestBody Message message) {
        message.set_id(ObjectId.get());
        repository.save(message);
        return message;
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
    public void deleteMessage(@PathVariable ObjectId _id) {
        repository.delete(repository.findBy_id(_id));
    }

}