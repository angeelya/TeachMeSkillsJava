package work32.session_facade;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/session_facade")
public class Servlet extends HttpServlet {
    private PrintWriter printWriter;
    private SessionFacade sessionFacade;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        printWriter = resp.getWriter();
        sessionFacade = new SessionFacade();
        printWriter.write(sessionFacade.doing());
    }
}
