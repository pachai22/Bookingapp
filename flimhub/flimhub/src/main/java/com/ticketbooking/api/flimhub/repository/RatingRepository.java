package com.ticketbooking.api.flimhub.repository;


import com.ticketbooking.api.flimhub.model.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends CrudRepository<Rating, String> {
}
