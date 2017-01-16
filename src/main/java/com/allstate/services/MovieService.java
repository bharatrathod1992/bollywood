package com.allstate.services;


import com.allstate.entities.Movie;
import com.allstate.repositories.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieService {

    @Autowired
    private IMovieRepository repository;

    public Movie create(Movie m){
        return  this.repository.save(m);
    }

}
