package com.movierating;

import com.movierating.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository {
    // These methods match what your in-memory MovieService is doing

    Movie save(Movie movie);

    Optional<Movie> findById(Long id);

    List<Movie> findAll();

    void deleteById(Long id);
}
