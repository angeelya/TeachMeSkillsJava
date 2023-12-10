package work25;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/bootstrapPractice","/superheroHome"})
public class Servlet extends HttpServlet {
    private String path;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        path= req.getServletPath();
        if(path.equals("/bootstrapPractice"))
            resp.sendRedirect("/work25/bootstrap_work25.html");
        else if(path.equals("/superheroHome"))
            resp.sendRedirect("/work25/superhero_bootstrap_work25.html");
    }
}
