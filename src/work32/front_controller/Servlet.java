package work32.front_controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface Servlet {
    void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
