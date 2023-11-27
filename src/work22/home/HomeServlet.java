package work22.home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

@WebServlet(name = "HomeServlet", urlPatterns = {"/minsk", "/washington", "/beijing", "/age"})
public class HomeServlet extends HttpServlet {
    private PrintWriter printWriter;
    private LocalTime localTime;
    private String path;

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        path = req.getServletPath();
        resp.setContentType("text/html");
        printWriter = resp.getWriter();
        if (path.equals("/minsk"))
            localTime = LocalTime.now(ZoneId.of("Europe/Minsk"));
        if (path.equals("/washington"))
            localTime = LocalTime.now(ZoneId.of("America/Washington"));
        if (path.equals("/beijing"))
            localTime = LocalTime.now(ZoneId.of("Asia/Shanghai"));
        printWriter.write(path + ": " + localTime.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        path = req.getServletPath();
        resp.setContentType("text/html");
        printWriter = resp.getWriter();
        if (path.equals("/age")) {
            try {
                Integer age = Integer.valueOf(req.getParameter("age"));
                if (age < 18)
                    printWriter.write("Minor " + age);
                else printWriter.write("Adult " + age);
            } catch (NumberFormatException e) {
                printWriter.write("It isn't age");
            }
        }
    }
}
