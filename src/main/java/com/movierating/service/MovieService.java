package com.movierating.service;
import com.movierating.Movie;
import com.movierating.exception.MovieNotFoundException;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MovieService {

    private final Map<Long, Movie> movieMap = new HashMap<>();
    private Long nextId = 1L;

    public Movie addMovie(Movie movie) {
        movie.setId(nextId++);
        movieMap.put(movie.getId(), movie);
        return movie;
    }

    public Movie updateMovie(Long id, Movie movie) {
        Movie existing = movieMap.get(id);
        if (existing == null) throw new MovieNotFoundException("Movie not found with ID " + id);
        existing.setTitle(movie.getTitle());
        existing.setRating(movie.getRating());
        return existing;
    }

    public Movie getMovieById(Long id) {
        Movie movie = movieMap.get(id);
        if (movie == null) throw new MovieNotFoundException("Movie not found with ID " + id);
        return movie;
    }

    public List<Movie> getAllMovies() {
        return new ArrayList<>(movieMap.values());
    }

    public void deleteMovie(Long id) {
        if (!movieMap.containsKey(id)) throw new MovieNotFoundException("Movie not found with ID " + id);
        movieMap.remove(id);
    }
}
