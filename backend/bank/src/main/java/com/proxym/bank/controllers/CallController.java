package com.proxym.bank.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proxym.bank.repositories.CallRepository;
import com.proxym.bank.entities.Call;

import javax.validation.Valid;
import java.util.List;



@RestController
@RequestMapping("/call")
public class CallController {
    @Autowired
    private CallRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Call> getAllCalls() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Call getCallById(@PathVariable("id") ObjectId _id) {
        return repository.findBy_id(_id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyCallById(@PathVariable("id") ObjectId _id, @Valid @RequestBody Call call) {
        call.set_id(_id);
        repository.save(call);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Call createCall(@Valid @RequestBody Call call) {
        call.set_id(ObjectId.get());
        repository.save(call);
        return call;
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
    public void deleteCall(@PathVariable ObjectId _id) {
        repository.delete(repository.findBy_id(_id));
    }

}