package com.eltonjavaorders.demo.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;

    private double advanceamount;
    private double ordamount;
    private String orderdescription;

    @ManyToOne()
    @JoinColumn(name = "custcode", nullable = false)
    @JsonIgnoreProperties(value = "orders")
    private Customer customer;

    @ManyToMany()
    @JoinTable(name = "orderspayments",
            joinColumns = @JoinColumn(name = "ordnum"),
            inverseJoinColumns = @JoinColumn(name = "paymentid"))
    @JsonIgnoreProperties(value = "orders")
    private List<Payment> payments = new ArrayList<>();

    public Order()
    {
    }

    public Order(double advanceamount, double ordamount, String orderdescription, Customer customer)
    {
        this.advanceamount = advanceamount;
        this.ordamount = ordamount;
        this.orderdescription = orderdescription;
        this.customer = customer;
    }

    public long getOrdnum()
    {
        return ordnum;
    }

    public void setOrdnum(long ordnum)
    {
        this.ordnum = ordnum;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount)
    {
        this.advanceamount = advanceamount;
    }

    public double getOramount()
    {
        return ordamount;
    }

    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }

    public String getOrderdescription()
    {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription)
    {
        this.orderdescription = orderdescription;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public List<Payment> getPayments()
    {
        return payments;
    }

    public void setPayments(List<Payment> payments)
    {
        this.payments = payments;
    }

    public void addPayments(Payment payment)
    {
        payment.getOrders().add(this);
        payments.add(payment);
    }

//    @Override
//    public String toString()
//    {
//        return "Order{" +
//                "ordnum=" + ordnum +
//                ", advanceamount=" + advanceamount +
//                ", orderamount=" + ordamount +
//                ", orderdescription='" + orderdescription + '\'' +
//                ", customer=" + customer +
//                ", payments=" + payments +
//                '}';
//    }
}
