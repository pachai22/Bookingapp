package com.ticketbooking.api.flimhub.web;


import com.ticketbooking.api.flimhub.model.Payment;
import com.ticketbooking.api.flimhub.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/payments", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Payment> getPayaments(){
        return (List<Payment>) paymentService.getAllPayments();
    }

    @RequestMapping(value = "/payments", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment){
        Payment createdPayment = paymentService.createPayment(payment);
        return Optional.ofNullable(createdPayment)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/payments", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Payment> CreatePayment(Payment payment){
        Payment createdPayment = paymentService.createPayment(payment);
        return Optional.ofNullable(createdPayment)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }

}
