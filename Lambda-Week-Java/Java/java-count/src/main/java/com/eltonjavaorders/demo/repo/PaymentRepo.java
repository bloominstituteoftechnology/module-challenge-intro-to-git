package com.eltonjavaorders.demo.repo;

import com.eltonjavaorders.demo.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment, Long>
{

}
