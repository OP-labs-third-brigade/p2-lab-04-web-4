package com.example.lab4;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(name = "MovieServlet", urlPatterns = {"/movies"})
public class MovieServlet extends HttpServlet {

    private Database database;

    @Override
    public void init() throws ServletException {
        super.init();
        // Ініціалізація бази даних з класу DataInitializer
        database = DataInitializer.initializeData();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Отримання списку фільмів
        List<Movie> movies = database.getMovies();

        // Передача даних до JSP-сторінки
        request.setAttribute("movies", movies);
        request.getRequestDispatcher("movies.jsp").forward(request, response);
    }
}