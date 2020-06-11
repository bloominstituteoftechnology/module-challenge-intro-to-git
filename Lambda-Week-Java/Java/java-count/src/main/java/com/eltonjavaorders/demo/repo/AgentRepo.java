package com.eltonjavaorders.demo.repo;

import com.eltonjavaorders.demo.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepo extends CrudRepository<Agent, Long>
{
}
