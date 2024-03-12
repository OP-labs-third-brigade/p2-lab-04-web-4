package com.example.lab4;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ActorController", urlPatterns = {"/actors-list"})
public class ActorController extends HttpServlet {

    public ActorController() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Database database = DataInitializer.initializeData();
        request.setAttribute("actors", database.getActors());
        RequestDispatcher dispatcher = request.getRequestDispatcher("actors.jsp");
        dispatcher.forward(request, response);
    }
}