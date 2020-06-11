package com.eltonjavaorders.demo.repo;

import com.eltonjavaorders.demo.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long>
{
}
