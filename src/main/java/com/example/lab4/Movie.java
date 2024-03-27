package com.example.lab4;

import java.util.List;

public class Movie {
    private int id;
    private String name;
    private List<Actor> actors;

    public Movie(int id, String name, List<Actor> actors) {
        this.id = id;
        this.name = name;
        this.actors = actors;
    }

    public static Movie getMovieWithMostActors(Database database) {
        if (database.movies == null || database.movies.isEmpty()) {
            return null;
        }

        Movie movieWithMostActors = database.movies.get(0);

        for (Movie movie : database.movies) {
            if (movie.getActors().size() > movieWithMostActors.getActors().size()) {
                movieWithMostActors = movie;
            }
        }

        return movieWithMostActors;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Actor> getActors() {
        return actors;
    }
}