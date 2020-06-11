package com.eltonjavaorders.demo.controllers;

import com.eltonjavaorders.demo.models.Order;
import com.eltonjavaorders.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderContoller
{
    @Autowired
    private OrderService orderService;

    //http://localhost:2019/orders/order/7
    @GetMapping(value = "/order/{id}", produces = {"application/json"})
    public ResponseEntity<?> listOrdersById(@PathVariable long id)
    {
        Order o = orderService.findById(id);
            return new ResponseEntity<>(o, HttpStatus.OK);
    }
}
