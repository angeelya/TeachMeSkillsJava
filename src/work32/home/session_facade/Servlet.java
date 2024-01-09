package work32.home.session_facade;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/smartHouse")
public class Servlet extends HttpServlet {
    private PrintWriter printWriter;
    private SmartHouse smartHouse;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String isHot = req.getParameter("isHot");
        PrintWriter printWriter = resp.getWriter();
        if (isHot != null) {
            if (isHot.equals("true")) {
                smartHouse = new SmartHouse(true);
            } else {
                smartHouse = new SmartHouse(false);
            }
            printWriter.write(smartHouse.turnOn());
            printWriter.write(smartHouse.turnOff());
        } else printWriter.write("Indicate whether it's hot or not at home");
    }
}
