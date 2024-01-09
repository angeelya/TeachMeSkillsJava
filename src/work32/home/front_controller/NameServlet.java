package work32.home.front_controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class NameServlet implements Servlet {
    private PrintWriter printWriter;
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printWriter = response.getWriter();
        String name = request.getParameter("name");
        if(name!=null&&!name.equals(""))
        printWriter.write(name);
        else printWriter.write("Enter name");
    }
}
