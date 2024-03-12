package com.example.lab4;

import java.util.List;

public class Movie {
    private int id;
    private String name;
    private List<Actor> actors;

    public Movie(String name, List<Actor> actors) {
        this.name = name;
        this.actors = actors;
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