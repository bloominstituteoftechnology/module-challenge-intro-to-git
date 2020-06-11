package com.eltonjavaorders.demo.services;

import com.eltonjavaorders.demo.models.Customer;
import com.eltonjavaorders.demo.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "customerService")
public class CustomerServiceimpl
        implements CustomerService
{
    // use @autoWire to connect this to customer repo! idk why hah

    @Autowired
    private CustomerRepo custrepo;

    @Override
    public List<Customer> findAllCustomers()
    {
        List<Customer> rtnList = new ArrayList<>();

        custrepo.findAll()
        .iterator()
        .forEachRemaining(rtnList::add);
        return rtnList;
    }

    @Override
    public Customer findCustomerById(long id)
    {
        return custrepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer" + id + "not found."));
    }

    @Override
    public List<Customer> findByNameLike(String thename)
    {

        return custrepo.findByCustnameContainingIgnoreCase(thename);
    }

    @Override
    public void delete(long id)
    {

    }

    @Override
    public Customer save(Customer customer)
    {
        return null;
    }
}
