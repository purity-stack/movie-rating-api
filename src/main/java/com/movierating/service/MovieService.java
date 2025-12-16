package com.movierating.service;
	import java.util.List;

	import org.springframework.stereotype.Service;

	import com.movierating.Movie;
	import com.movierating.MovieRepository;

	@Service
	public class MovieService {

	    private final MovieRepository movieRepository;

	    public MovieService(MovieRepository movieRepository) {
	        this.movieRepository = movieRepository;
	    }

	    // Get all movies
	    public List<Movie> getAllMovies() {
	        return movieRepository.findAll();
	    }

	    // Get a movie by ID
	    public Movie getMovieById(Long id) {
	        return movieRepository.findById(id).orElse(null);
	    }

	    // Save a new movie
	    public Movie saveMovie(Movie movie) {
	        return movieRepository.save(movie);
	    }

	    // Update an existing movie
	    public Movie updateMovie(Long id, Movie updatedMovie) {
	        return movieRepository.findById(id).map(movie -> {
	            movie.setTitle(updatedMovie.getTitle());
	            movie.setRating(updatedMovie.getRating());
	            return movieRepository.save(movie);
	        }).orElse(null);
	    }

	    // Delete a movie by ID
	    public boolean deleteMovie(Long id) {
	        if (movieRepository.existsById(id)) {
	            movieRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
	}


