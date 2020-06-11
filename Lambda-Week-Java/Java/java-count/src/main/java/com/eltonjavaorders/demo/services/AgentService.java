package com.eltonjavaorders.demo.services;

import com.eltonjavaorders.demo.models.Agent;

import java.util.List;

public interface AgentService
{
    List<Agent> findAllAgents();

    Agent findById(long id);
}
