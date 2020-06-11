package com.eltonjavaorders.demo.services;

import com.eltonjavaorders.demo.models.Order;

import java.util.List;

public interface OrderService
{
    List<Order> findAllOrders();

    Order findById(long id);


}
