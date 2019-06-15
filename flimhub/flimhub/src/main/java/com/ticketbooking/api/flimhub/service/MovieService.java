package com.ticketbooking.api.flimhub.service;


import com.ticketbooking.api.flimhub.model.Movie;
import com.ticketbooking.api.flimhub.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MovieService{


    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();

    }

    public Movie getMovieById(String id){
        return movieRepository.findById(id).get();
    }


    public Movie createMovie(Movie movie) {
        return  movieRepository.save(movie);
    }



}
