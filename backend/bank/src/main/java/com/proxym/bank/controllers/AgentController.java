package com.proxym.bank.controllers;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proxym.bank.repositories.AgentRepository;
import com.proxym.bank.entities.Agent;

import javax.validation.Valid;
import java.util.List;



@RestController
@RequestMapping("/agent")
public class AgentController {
    @Autowired
    private AgentRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Agent> getAllAgents() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Agent getAgentById(@PathVariable("id") ObjectId _id) {
        return repository.findBy_id(_id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyAgentById(@PathVariable("id") ObjectId _id, @Valid @RequestBody Agent agent) {
        agent.set_id(_id);
        repository.save(agent);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Agent createAgent(@Valid @RequestBody Agent agent) {
        agent.set_id(ObjectId.get());
        repository.save(agent);
        return agent;
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
    public void deleteAgent(@PathVariable ObjectId _id) {
        repository.delete(repository.findBy_id(_id));
    }

}