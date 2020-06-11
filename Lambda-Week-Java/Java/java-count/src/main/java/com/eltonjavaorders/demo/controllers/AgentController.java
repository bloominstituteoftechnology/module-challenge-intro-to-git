package com.eltonjavaorders.demo.controllers;

import com.eltonjavaorders.demo.models.Agent;
import com.eltonjavaorders.demo.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
public class AgentController
{

    @Autowired
    private AgentService agentService;

    //http://localhost:2019/agents/agent/9
    @GetMapping(value = "/agent/{id}", produces = {"application/json"})
    public ResponseEntity<?> listOrderById(@PathVariable long id)
    {
        Agent o = agentService.findById(id);
            return new ResponseEntity<>(o, HttpStatus.OK);
    }


}
