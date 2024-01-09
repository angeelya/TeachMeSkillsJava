package work32.home.front_controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AgeServlet implements Servlet{
    private PrintWriter printWriter;
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printWriter= response.getWriter();
        try {
            Integer age = Integer.valueOf(request.getParameter("age"));
            if (age < 18)
                printWriter.write("It isn't adult " + age);
            else printWriter.write("It's adult " + age);
        } catch (NumberFormatException e) {
            printWriter.write("It isn't age");
        }
    }
}
