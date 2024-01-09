package work32.front_controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import work32.front_controller.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class TimeServlet implements Servlet {
    private PrintWriter printWriter;
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printWriter = response.getWriter();
        printWriter.write(LocalDateTime.now().toString());
    }
}
