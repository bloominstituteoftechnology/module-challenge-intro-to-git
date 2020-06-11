package com.eltonjavaorders.demo.services;


import com.eltonjavaorders.demo.models.Customer;

import java.util.List;

public interface CustomerService
{
    List<Customer> findAllCustomers();

    Customer findCustomerById(long id);

    // need to add pram for sting - idk yet - keep watching!!
    List<Customer> findByNameLike(String thename);
}
