package com.example.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task3 {
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
}