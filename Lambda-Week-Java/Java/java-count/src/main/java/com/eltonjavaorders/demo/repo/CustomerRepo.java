package com.eltonjavaorders.demo.repo;

import com.eltonjavaorders.demo.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo
        extends CrudRepository<Customer, Long>
{
    List<Customer> findByCustnameContainingIgnoreCase(String thename);
}
