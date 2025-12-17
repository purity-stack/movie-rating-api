package com.movierating;

import jakarta.validation.constraints.*;

public class Movie {
    private Long id;

    @NotBlank(message = "Title cannot be empty")
    private String title;

    @Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 10, message = "Rating cannot be more than 10")
    private int rating;

    // Constructors, getters, and setters
    public Movie() {}

    public Movie(Long id, String title, int rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
}
