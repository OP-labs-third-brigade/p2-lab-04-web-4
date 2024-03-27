import com.example.lab4.DataInitializer;
import com.example.lab4.Database;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MoviesController", value = "/MoviesController")
public class MoviesController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Database database = DataInitializer.initializeData();
            getServletContext().setAttribute("movies", database.getMovies());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("WEB-INF/movies.jsp").forward(request,response);
    }
}
