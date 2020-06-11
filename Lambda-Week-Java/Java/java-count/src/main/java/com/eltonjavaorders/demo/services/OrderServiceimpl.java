package com.eltonjavaorders.demo.services;

import com.eltonjavaorders.demo.models.Order;
import com.eltonjavaorders.demo.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;



@Service(value = "orderService")
public class OrderServiceimpl
    implements OrderService
{
    @Autowired
    private OrderRepo ordrepo;


    @Override
    public List<Order> findAllOrders()
    {
        return null;
    }

    @Override
    public Order findById(long id)
    {
        return ordrepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Order" + id + "not found."));
    }
}
