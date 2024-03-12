package com.example.lab4;

import java.util.List;

public class Actor {
    private int id;
    private String name;
    private List<Movie> movies;

    public Actor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    // Додайте гетери та сетери для інших полів

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return name;
    }
}