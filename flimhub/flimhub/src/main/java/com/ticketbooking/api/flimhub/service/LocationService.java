package com.ticketbooking.api.flimhub.service;

import com.ticketbooking.api.flimhub.model.Location;
import com.ticketbooking.api.flimhub.model.Theatre;
import com.ticketbooking.api.flimhub.repository.LocationRepository;
import com.ticketbooking.api.flimhub.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {


    @Autowired
    private LocationRepository locationRepository;


    public Location getLocationById(Integer id){
        return locationRepository.findById(id).get();
    }
    public Location createLocation(Location location)
    {
        return locationRepository.save(location);
    }


    public List<Location> getAllLocations() {
        return (List<Location>) locationRepository.findAll();
    }
}


