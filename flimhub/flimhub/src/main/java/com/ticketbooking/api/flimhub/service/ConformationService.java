package com.ticketbooking.api.flimhub.service;


import com.ticketbooking.api.flimhub.model.Conformation;
import com.ticketbooking.api.flimhub.repository.ConformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConformationService {

    @Autowired
    private ConformationRepository conformationRepository;

    public List<Conformation> getAllconformations(){
        return (List<Conformation>) conformationRepository.findAll();
    }
    public Conformation getConformationsById(String id){
        return conformationRepository.findById(id).get();

    }

    public Conformation createConformation(Conformation conformation){
        return conformationRepository.save(conformation);
    }

}
