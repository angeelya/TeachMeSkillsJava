package work32.front_controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/front/*")
public class FrontController extends HttpServlet {
    private Map<String, Servlet> servlets;

    @Override
    public void init() throws ServletException {
        super.init();
        servlets = new HashMap<>();
        servlets.put("/hello", new HelloServlet());
        servlets.put("/time", new TimeServlet());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        Servlet servlet = servlets.get(path);
        if(servlet!=null)
        {
            servlet.handleRequest(req,resp);
        }
        else resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
}
