package com.ticketbooking.api.flimhub.service;

import com.ticketbooking.api.flimhub.model.Rating;
import com.ticketbooking.api.flimhub.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;



    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public List<Rating> getAllRatings(){
        return (List<Rating>) ratingRepository.findAll();
    }

    public Rating getRatingById(String id){
        return ratingRepository.findById(id).get();


    }
}