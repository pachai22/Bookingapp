package com.ticketbooking.api.flimhub.web;

import com.ticketbooking.api.flimhub.model.Rating;
import com.ticketbooking.api.flimhub.model.User;
import com.ticketbooking.api.flimhub.service.RatingService;
import com.ticketbooking.api.flimhub.service.UserService;
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
public class RatingController {

    @Autowired
    private RatingService ratingService;


    @RequestMapping(value = "/ratings", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Rating> getAll(){
        return ratingService.getAllRatings();
    }

    @RequestMapping(value="/ratings ", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        Rating createdRating = ratingService.createRating(rating);
        return Optional.ofNullable(createdRating)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse (ResponseEntity.notFound().build());
    }

    @RequestMapping(value="/ratings ", method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Rating> CreateRating(@RequestBody Rating rating){
       Rating createdRating = ratingService.createRating(rating);
        return Optional.ofNullable(createdRating)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse (ResponseEntity.notFound().build());
    }

}


