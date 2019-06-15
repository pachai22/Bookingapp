package com.ticketbooking.api.flimhub.repository;

import com.ticketbooking.api.flimhub.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment,String> {
}
