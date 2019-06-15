package com.ticketbooking.api.flimhub.repository;

import com.ticketbooking.api.flimhub.model.Conformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConformationRepository extends CrudRepository<Conformation, String> {
}
