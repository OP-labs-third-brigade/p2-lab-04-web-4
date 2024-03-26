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
        actors.add(new Actor(0, "Леонардо"));
        actors.add(new Actor(1, "Томас"));
        actors.add(new Actor(2, "Бред"));
        actors.add(new Actor(3, "Едвард"));
        actors.add(new Actor(4, "Ума"));
        actors.add(new Actor(5, "Елен"));
        actors.add(new Actor(6, "Том"));
        return actors;
    }

    private static List<Movie> initializeMovies(List<Actor> actors) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(0, "Sky", new ArrayList<Actor>()));
        movies.add(new Movie(1, "Inception", new ArrayList<Actor>()));
        movies.add(new Movie(2, "Forrest", Arrays.asList(actors.get(0), actors.get(1), actors.get(2), actors.get(3))));
        movies.add(new Movie(3, "Way to home", Arrays.asList(actors.get(1), actors.get(2))));
        movies.add(new Movie(4, "Run", Arrays.asList(actors.get(1), actors.get(3), actors.get(4), actors.get(0), actors.get(5), actors.get(2))));

        for (Movie movie : movies) {
            for (Actor actor : movie.getActors()) {
                actor.getMovies().add(movie);
            }
        }

        return movies;
    }
}
