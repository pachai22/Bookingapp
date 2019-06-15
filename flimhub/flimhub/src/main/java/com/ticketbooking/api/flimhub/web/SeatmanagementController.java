package com.ticketbooking.api.flimhub.web;


import com.ticketbooking.api.flimhub.model.Seatmanagement;
import com.ticketbooking.api.flimhub.repository.SeatmanagementRepository;
import com.ticketbooking.api.flimhub.service.SeatmanagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SeatmanagementController {

    @Autowired
    private SeatmanagementService seatmanagementService;

    @RequestMapping(value = "/seats", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Seatmanagement> getSeatmanagements(){
        return   seatmanagementService.getAllSeatmanagements();
    }

    @RequestMapping(value="/seats", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Seatmanagement> createdSeatmangement(Seatmanagement seatmanagement){
        Seatmanagement createdSeatmanagement = seatmanagementService.createSeatmanagement(seatmanagement);
        return Optional.ofNullable(createdSeatmanagement)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());


    }

    @RequestMapping(value="/seats", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Seatmanagement> CreatedSeatmanagement(Seatmanagement seatmanagement){
        Seatmanagement createdSeatmanagement = seatmanagementService.createSeatmanagement(seatmanagement);
        return Optional.ofNullable(createdSeatmanagement)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }
}
