import com.example.lab4.Actor;
import com.example.lab4.DataInitializer;
import com.example.lab4.Database;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ActorController", value = "/ActorController")
public class ActorController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int actorId = Integer.parseInt(request.getParameter("actorId"));

        Database database = DataInitializer.initializeData();
        List<Actor> actors= database.getActors();

        getServletContext().setAttribute("actors", actors);
        getServletContext().setAttribute("coactors", Actor.getCoactors(actorId, database));
        getServletContext().setAttribute("movies", actors.get(actorId).getMovies());

        request.setAttribute("actorId", actorId);

        request.getRequestDispatcher("WEB-INF/actor.jsp").forward(request, response);
    }
}
