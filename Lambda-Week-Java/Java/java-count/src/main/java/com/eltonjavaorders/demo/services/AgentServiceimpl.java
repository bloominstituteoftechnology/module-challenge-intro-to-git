package com.eltonjavaorders.demo.services;


import com.eltonjavaorders.demo.models.Agent;
import com.eltonjavaorders.demo.repo.AgentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service(value = "agentService")
public class AgentServiceimpl
    implements AgentService
{
    @Autowired
    private AgentRepo agtrepo;


    @Override
    public List<Agent> findAllAgents()
    {
        return null;
    }

    @Override
    public Agent findById(long id)
    {
        return agtrepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Agent" + id + "not found."));
    }
}
