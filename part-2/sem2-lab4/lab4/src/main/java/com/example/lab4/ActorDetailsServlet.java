package com.example.lab4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ActorDetailsServlet", urlPatterns = {"/actor"})
public class ActorDetailsServlet extends HttpServlet {

    private Database database;

    @Override
    public void init() throws ServletException {
        super.init();
        database = DataInitializer.initializeData();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int actorId = Integer.parseInt(request.getParameter("id"));
        Actor actor = null;

        for (Actor a : database.getActors()) {
            if (a.getId() == actorId) {
                actor = a;
                List<Movie> actorMovies = new ArrayList<>();
                for (Movie m : database.getMovies()) {
                    if (m.getActors().contains(actor)) {
                        actorMovies.add(m);
                    }
                }
                actor.setMovies(actorMovies);
                break;
            }
        }

        List<Actor> coactors = Task2.getCoactors(actor, database);

        request.setAttribute("actor", actor);
        request.setAttribute("coactors", coactors);
        request.getRequestDispatcher("actor.jsp").forward(request, response);
    }
}