package com.allstate.controllers;

import com.allstate.entities.Movie;
import com.allstate.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by localadmin on 16/01/17.
 */

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Movie create(@RequestBody Movie movie){
        return this.movieService.create(movie);
    };

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Movie> listMovies(){
        return this.movieService.listMovies();
    };

    public void update(){};

    public void delete(){};

}
