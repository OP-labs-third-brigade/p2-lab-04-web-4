import com.example.lab4.Actor;
import com.example.lab4.DataInitializer;
import com.example.lab4.Database;
import com.example.lab4.Movie;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "InfoController", value = "/InfoController")
public class InfoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Database database = DataInitializer.initializeData();
            getServletContext().setAttribute("unfilmedActors", Actor.getUnfilmedActors(database));
            getServletContext().setAttribute("movieWithMostActors", Movie.getMovieWithMostActors(database).getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("WEB-INF/info.jsp").forward(request,response);
    }
}
