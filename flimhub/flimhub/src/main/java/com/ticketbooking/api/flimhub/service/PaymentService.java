package com.ticketbooking.api.flimhub.service;

import com.ticketbooking.api.flimhub.model.Payment;
import com.ticketbooking.api.flimhub.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayments(){
        return (List<Payment>) paymentRepository.findAll();
    }

    public Payment getPaymentById(String id){
        return paymentRepository.findById(id).get();

    }

    public Payment createPayment(Payment payment){
        return paymentRepository.save(payment);
    }
}
