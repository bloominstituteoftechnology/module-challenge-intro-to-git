package com.eltonjavaorders.demo.controllers;


import com.eltonjavaorders.demo.models.Customer;
import com.eltonjavaorders.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerContoller
{

    @Autowired
    private CustomerService customerService;


    //http://localhost:2019/customers/orders
    @GetMapping(value = "/orders", produces = {"application/json"})
    public ResponseEntity<?> listAllCustomers()
    {
        List<Customer> mycustomers = customerService.findAllCustomers();
        return new ResponseEntity<>(mycustomers, HttpStatus.OK);
    }



    //http://localhost:2019/customers/customer/7
    @GetMapping(value = "/customer/{id}", produces = {"application/json"})
    public ResponseEntity<?> listCustomersById(@PathVariable long id)
    {
        Customer c = customerService.findCustomerById(id);
                return new ResponseEntity<>(c, HttpStatus.OK);
    }

    //http://localhost:2019/customers/namelike/cin
    @GetMapping(value = "/namelike/{thename}", produces = {"application/json"})
        public ResponseEntity<?> findByLikeName(@PathVariable String thename)
    {
       List<Customer> mycustomers = customerService.findByNameLike(thename);
        return new ResponseEntity<>(mycustomers, HttpStatus.OK);

    }


}
