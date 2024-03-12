package com.example.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataInitializer {

    public static Database initializeData() {
        List<Actor> actors = initializeActors();
        List<Movie> movies = initializeMovies(actors);
        return new Database(movies, actors);
    }

    private static List<Actor> initializeActors() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor(1, "Leonardo"));
        actors.add(new Actor(2, "Thomas"));
        actors.add(new Actor(3, "Brad"));
        actors.add(new Actor(4, "Edward"));
        actors.add(new Actor(5, "Uma"));
        actors.add(new Actor(6, "Ellen"));
        actors.add(new Actor(7, "Tom"));
        return actors;
    }

    private static List<Movie> initializeMovies(List<Actor> actors) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Sky", new ArrayList<>()));
        movies.add(new Movie("Inception", new ArrayList<>()));
        movies.add(new Movie("Forrest", Arrays.asList(actors.get(0), actors.get(1), actors.get(2), actors.get(3))));
        movies.add(new Movie("Way to home", Arrays.asList(actors.get(1), actors.get(2))));
        movies.add(new Movie("Run", Arrays.asList(actors.get(1), actors.get(3), actors.get(4), actors.get(0), actors.get(5), actors.get(2))));
        return movies;
    }
}
