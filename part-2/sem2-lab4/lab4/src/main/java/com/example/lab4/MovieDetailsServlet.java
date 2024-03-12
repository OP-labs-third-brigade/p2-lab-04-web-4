package com.example.lab4;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "MovieDetailsServlet", urlPatterns = {"/movie"})
public class MovieDetailsServlet extends HttpServlet {

    private Database database;

    @Override
    public void init() throws ServletException {
        super.init();
        database = DataInitializer.initializeData();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int movieId = Integer.parseInt(request.getParameter("id"));
        Movie movie = null;

        for (Movie m : database.getMovies()) {
            if (m.getId() == movieId) {
                movie = m;
                break;
            }
        }

        request.setAttribute("movie", movie);
        request.getRequestDispatcher("movie.jsp").forward(request, response);
    }
}