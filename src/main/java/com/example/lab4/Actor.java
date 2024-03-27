package com.example.lab4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Actor {
    private int id;
    private String name;
    private List<Movie> movies;

    public Actor(int id, String name) {
        this.id = id;
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public void setMovies(List<Movie> movies) {
        this.movies.clear();
        this.movies.addAll(movies);
        for (Movie movie : movies) {
            if (!movie.getActors().contains(this)) {
                movie.getActors().add(this);
            }
        }
    }

    public static List<Actor> getCoactors(int id, Database database) {
        List<Actor> coactors = new ArrayList<>();
        Set<Actor> visitedActors = new HashSet<>();
        Actor actor = database.getActors().get(id);

        for (Movie movie : database.movies) {
            if (movie.getActors().contains(actor)) {
                for (Actor movieActor : movie.getActors()) {
                    if (!visitedActors.contains(movieActor) && !movieActor.equals(actor)) {
                        coactors.add(movieActor);
                        visitedActors.add(movieActor);
                    }
                }
            }
        }

        return coactors;
    }

    public static List<Actor> getUnfilmedActors(Database database) {
        List<Actor> unfilmedActors = new ArrayList<>();
        Set<Actor> visitedActors = new HashSet<>();

        for (Movie movie : database.movies) {
            for (Actor movieActor : movie.getActors()) {
                visitedActors.add(movieActor);
            }
        }

        for (Actor actor : database.actors) {
            if (!visitedActors.contains(actor)) {
                unfilmedActors.add(actor);
            }
        }

        return unfilmedActors;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}