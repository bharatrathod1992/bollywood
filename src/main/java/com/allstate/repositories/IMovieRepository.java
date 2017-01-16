package com.allstate.repositories;

import com.allstate.entities.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by localadmin on 16/01/17.
 */

public interface IMovieRepository extends CrudRepository<Movie, Integer> {
}
