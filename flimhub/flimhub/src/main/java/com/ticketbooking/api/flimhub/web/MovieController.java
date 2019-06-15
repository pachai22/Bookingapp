package com.ticketbooking.api.flimhub.web;


import com.ticketbooking.api.flimhub.model.Movie;

import com.ticketbooking.api.flimhub.service.MovieService;
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
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(value="/movies", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Movie> getMovies(){
        return (List<Movie>) movieService.getAllMovies();
     }
    @RequestMapping(value="/movies ", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
       Movie createdMovie = movieService.createMovie(movie);
        return Optional.ofNullable(createdMovie)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse (ResponseEntity.notFound().build());
    }

    @RequestMapping(value="/movies", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Movie> CreateMovie(@RequestBody Movie movie){
        Movie createdMovie = movieService.createMovie(movie);
        return Optional.ofNullable(createdMovie)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse (ResponseEntity.notFound().build());
    }


}

