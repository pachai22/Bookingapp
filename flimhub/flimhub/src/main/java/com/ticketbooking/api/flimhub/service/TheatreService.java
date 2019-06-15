package com.ticketbooking.api.flimhub.service;


import com.ticketbooking.api.flimhub.model.Theatre;
import com.ticketbooking.api.flimhub.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;


    public Theatre getTheatreById(String id){
        return theatreRepository.findById(id).get();
    }
    public Theatre createTheatre(Theatre theatre)
    {
        return theatreRepository.save(theatre);
    }


    public List<Theatre> getAllTheatres() {
        return (List<Theatre>) theatreRepository.findAll();
    }
}
