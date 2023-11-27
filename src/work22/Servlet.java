package work22;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = {"/hello", "/helloPost"})
public class Servlet extends HttpServlet {
    private PrintWriter printWriter;
    private String word;
    private String path;

    @Override
    public void init() throws ServletException {
        super.init();
        word = "Hello";

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        path = req.getServletPath();
        printWriter = resp.getWriter();
        resp.setContentType("text/html");
        if (path.equals("/hello")) {
            printHello(printWriter,req);
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       super.service(req,resp);
        System.out.println("call service");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        path = req.getServletPath();
        printWriter = resp.getWriter();
        if (path.equals("/helloPost")) {
            printHello(printWriter,req);
        }
    }

    private void printHello(PrintWriter printWriter, HttpServletRequest req) {
        String name = req.getParameter("name");
        if(name!=null)
        printWriter.write(word+", " + name);
        else printWriter.write("Hello");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("call destroy");
    }
}
