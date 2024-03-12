package com.example.lab4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
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
}