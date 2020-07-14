package com.eltonjavaorders.demo.services;


import com.eltonjavaorders.demo.models.Customer;

import java.util.List;

public interface CustomerService
{
    List<Customer> findAllCustomers();

    Customer findCustomerById(long id);

    // need to add pram for sting - idk yet - keep watching!!
    List<Customer> findByNameLike(String thename);

    // CRUD

    //Create => post
    // Read => get(done)
    // Update =>put

    //Delete => delete
    void delete(long id);

    // save will handle both post and put

    Customer save(Customer customer);

    // PATCH

    Customer update(Customer customer, long id);




}
