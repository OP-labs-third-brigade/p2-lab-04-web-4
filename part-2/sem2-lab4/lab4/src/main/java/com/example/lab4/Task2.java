package com.example.lab4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static List<Actor> getCoactors(Actor actor, Database database) {
        List<Actor> coactors = new ArrayList<>();
        Set<Actor> visitedActors = new HashSet<>();

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
}