package com.example.lab4;

import java.util.List;

public class Database {

    List<Movie> movies;
    List<Actor> actors;

    public Database(List<Movie> movies, List<Actor> actors) {
        this.movies = movies;
        this.actors = actors;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}