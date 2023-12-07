package work24;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(urlPatterns = {"/verse","/homeTask1","/homeTaskStar"})
public class Servlet extends HttpServlet {
    private String path;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       path=req.getServletPath();
        if(path.equals("/verse"))
        resp.sendRedirect("/verse_work24.html");
        else if(path.equals("/homeTask1"))
            resp.sendRedirect("/tms_work24.html");
        else if (path.equals("/homeTaskStar")) {
            resp.sendRedirect("superhero.html");
        }
    }
}
