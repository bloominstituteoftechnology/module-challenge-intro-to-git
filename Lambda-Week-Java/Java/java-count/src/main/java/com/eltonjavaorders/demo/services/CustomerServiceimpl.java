package com.eltonjavaorders.demo.services;

import com.eltonjavaorders.demo.models.Customer;
import com.eltonjavaorders.demo.models.Order;
import com.eltonjavaorders.demo.models.Payment;
import com.eltonjavaorders.demo.repo.CustomerRepo;
import com.eltonjavaorders.demo.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

// this means that if anything fails it will all fail - will not be able to delete anything!
@Transactional
@Service(value = "customerService")
public class CustomerServiceimpl
        implements CustomerService
{
    // use @autoWire to connect this to customer repo! idk why hah

    @Autowired
    private CustomerRepo custrepo;

    @Autowired
    private PaymentRepo payrepo;

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

    @Transactional
    @Override
    public void delete(long id)
    {
        if (custrepo.findById(id).isPresent())
        {
            custrepo.deleteById(id);

        } else
        {
            throw new EntityNotFoundException("Customer " + id + "not found");
        }


    }

    // okay but why is this
    // being so weird???
    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        Customer newCustomer = new Customer();

        //also do a put - do all of the other stuff below first

        if (customer.getCustcode() != 0)
        {
            // means we are doing a put!!
            custrepo.findById(customer.getCustcode())
                    .orElseThrow(() -> new EntityNotFoundException("Customer" + customer.getCustcode() + "not found"));

            newCustomer.setCustcode(customer.getCustcode());
        }

        // customers

        newCustomer.setCustname(customer.getCustname());
        newCustomer.setCustcity(customer.getCustcity());
        newCustomer.setCustcountry(customer.getCustcountry());
        newCustomer.setGrade(customer.getGrade());
        newCustomer.setOpeningamt(customer.getOpeningamt());
        newCustomer.setOutstandingamt(customer.getOutstandingamt());
        newCustomer.setPaymentamt(customer.getPaymentamt());
        newCustomer.setPhone(customer.getPhone());
        newCustomer.setReceiveamt(customer.getReceiveamt());
        newCustomer.setWorkingarea(customer.getWorkingarea());
        newCustomer.setAgent(customer.getAgent());

        // orders
//
        newCustomer.getOrders().clear();
        for (Order o : customer.getOrders())
        {
            Order newOrder = new Order(o.getAdvanceamount(), o.getOramount(), o.getOrderdescription(), newCustomer);
            newCustomer.getOrders().add(newOrder);
            for (Payment p : o.getPayments())
            {
                // payments
                Payment newPay = payrepo.findById(p.getPaymentid())
                        .orElseThrow(() -> new EntityNotFoundException("Payment" + p.getPaymentid() + "not found."));
                newOrder.addPayments(newPay);
            }

        }
        return custrepo.save(newCustomer);

    }

    //patch
    @Transactional
    @Override
    public Customer update(Customer customer, long id)
    {
        Customer currentCustomer = custrepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer" + id + "not found"));


        // customers
        if (customer.getCustname() != null)
        {
            currentCustomer.setCustname(customer.getCustname());
        }
        if (customer.getCustcity() != null)
        {
            currentCustomer.setCustcity(customer.getCustcity());
        }
        if (customer.getCustcountry() != null)
        {
            currentCustomer.setCustcountry(customer.getCustcountry());
        }
        if (customer.getGrade() != null)
        {
            currentCustomer.setGrade(customer.getGrade());
        }
        if (customer.getPhone() != null)
        {
            currentCustomer.setPhone(customer.getPhone());
        }
        if (customer.getWorkingarea() != null)
        {
            currentCustomer.setWorkingarea(customer.getWorkingarea());
        }
        if (customer.getAgent() != null)
        {
            currentCustomer.setAgent(customer.getAgent());
        }

        // longs
        if (customer.hasValueforRec)
        {
            currentCustomer.setReceiveamt(customer.getReceiveamt());
        }
        if (customer.hasValueforOut)
        {
            currentCustomer.setOutstandingamt(customer.getOutstandingamt());
        }
        if (customer.hasValueforOpening)
        {
            currentCustomer.setOpeningamt(customer.getOpeningamt());
        }
        if (customer.hasValueforPay)
        {
            currentCustomer.setPaymentamt(customer.getPaymentamt());
        }


        // orders

        if (customer.getOrders().size() > 0)
        {
            currentCustomer.getOrders().clear();

            for (Order o : customer.getOrders())
            {
                Order newOrder = new Order(o.getAdvanceamount(), o.getOramount(), o.getOrderdescription(), currentCustomer);
                currentCustomer.getOrders().add(newOrder);

                for (Payment p : o.getPayments())
                {
                    // payments idk what to do with you!!
                    Payment newPay = payrepo.findById(p.getPaymentid())
                            .orElseThrow(() -> new EntityNotFoundException("Payment" + p.getPaymentid() + "not found."));
                    newOrder.addPayments(newPay);
                }

            }
        }
        return custrepo.save(currentCustomer);
    }
}
