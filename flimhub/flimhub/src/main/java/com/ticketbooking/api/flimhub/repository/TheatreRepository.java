package com.ticketbooking.api.flimhub.repository;


import com.ticketbooking.api.flimhub.model.Theatre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends CrudRepository<Theatre, String> {
}
