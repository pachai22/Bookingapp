package com.ticketbooking.api.flimhub.service;

import com.ticketbooking.api.flimhub.model.Seatmanagement;
import com.ticketbooking.api.flimhub.model.Theatre;
import com.ticketbooking.api.flimhub.repository.SeatmanagementRepository;
import com.ticketbooking.api.flimhub.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatmanagementService {

    @Autowired
    private SeatmanagementRepository seatmanagementRepository;


    public Seatmanagement getSeatmanagementById(String id){
        return seatmanagementRepository.findById(id).get();
    }
    public Seatmanagement createSeatmanagement(Seatmanagement seatmanagement)
    {
        return seatmanagementRepository.save(seatmanagement);
    }


    public List<Seatmanagement> getAllSeatmanagements() {
        return (List<Seatmanagement>) seatmanagementRepository.findAll();
    }
}
