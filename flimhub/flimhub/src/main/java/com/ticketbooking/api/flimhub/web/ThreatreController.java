package com.ticketbooking.api.flimhub.web;


import com.ticketbooking.api.flimhub.model.Theatre;
import com.ticketbooking.api.flimhub.service.TheatreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ThreatreController {

    @Autowired
    private TheatreService theatreService;

    @RequestMapping(value = "/theatres", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Theatre> getTheatres() {
        return theatreService.getAllTheatres();
    }

    @RequestMapping(value = "/theatres", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Theatre> createThreatre(@RequestBody Theatre theatre) {
        Theatre createdTheatre = theatreService.createTheatre(theatre);
        return Optional.ofNullable(createdTheatre)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/theatres", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Theatre> createTheatre(@RequestBody Theatre theatre) {
        Theatre createdTheatre = theatreService.createTheatre(theatre);
        return Optional.ofNullable(createdTheatre)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());

    }

}



