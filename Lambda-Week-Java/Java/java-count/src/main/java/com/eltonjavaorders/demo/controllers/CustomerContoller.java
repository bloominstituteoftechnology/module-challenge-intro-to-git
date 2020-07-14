package com.eltonjavaorders.demo.controllers;


import com.eltonjavaorders.demo.models.Customer;
import com.eltonjavaorders.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
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

    // post
    //http://localhost:2019/customers/customers
    @PostMapping(value = "/customers", consumes= {"application/json"})
        public ResponseEntity<?> addNewCustomer(@Valid @RequestBody Customer newCustomer)
    {
        newCustomer.setCustcode(0);
        newCustomer = customerService.save(newCustomer);
        HttpHeaders responseHeaders = new HttpHeaders();

        URI newCustomerURI = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("{customerid}")
                .buildAndExpand(newCustomer .getCustcode())
                .toUri();
        responseHeaders.setLocation(newCustomerURI);
        return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }


    // put ----- http://localhost:2019/customers/customer/7
    @PutMapping(value = "/customer/{id}", consumes= {"application/json"})
        public ResponseEntity<?> updateCustomer(@Valid @RequestBody Customer updateCustomer, @PathVariable long id)
    {
        updateCustomer.setCustcode(id);
        customerService.save(updateCustomer);

           return new ResponseEntity<>(HttpStatus.OK);
    }

    // working

    // patch ----- http://localhost:2019/customers/customer/7
    @PatchMapping(value = "/customer/{id}", consumes= {"application/json"})
        public ResponseEntity<?> updateoneCustomer(@RequestBody Customer updateoneCustomer, @PathVariable long id )
    {
        customerService.update(updateoneCustomer,id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    // working

    //delete ------ http://localhost:2019/customers/customer/7
    @DeleteMapping(value = "/customer/{id}")
    public ResponseEntity<?> deleteCustomersById(@PathVariable long id)
    {
        customerService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }






}
