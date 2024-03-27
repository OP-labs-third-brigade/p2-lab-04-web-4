import com.example.lab4.DataInitializer;
import com.example.lab4.Database;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MovieController", value = "/MovieController")
public class MovieController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String movieId = request.getParameter("movieId");

        Database database = DataInitializer.initializeData();
        getServletContext().setAttribute("movies", database.getMovies());

        request.setAttribute("movieId", movieId);

        request.getRequestDispatcher("WEB-INF/movie.jsp").forward(request, response);
    }
}
