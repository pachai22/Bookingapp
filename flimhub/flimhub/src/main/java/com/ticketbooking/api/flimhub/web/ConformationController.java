package com.ticketbooking.api.flimhub.web;


import com.ticketbooking.api.flimhub.model.Conformation;
import com.ticketbooking.api.flimhub.service.ConformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class ConformationController {

    @Autowired
    private ConformationService conformationService;

    @RequestMapping(value = "/conformations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Conformation> getConformations(){
        return  conformationService.getAllconformations();
    }

    @RequestMapping(value = "/conformations", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Conformation> createConformation(@RequestBody Conformation conformation){
        Conformation createdConformation = conformationService.createConformation(conformation);
        return Optional.ofNullable(createdConformation)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "conformation", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Conformation> Createdconformation(@RequestBody Conformation conformation){
        Conformation createdConformation = conformationService.createConformation(conformation);
        return Optional.ofNullable(createdConformation)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }
}
