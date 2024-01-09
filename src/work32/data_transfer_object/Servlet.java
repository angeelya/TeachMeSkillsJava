package work32.data_transfer_object;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cat")
public class Servlet extends HttpServlet {
    private Cat cat;
    private PrintWriter printWriter;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name"), age = req.getParameter("age"),
                color = req.getParameter("color");
        printWriter =resp.getWriter();
        if(name!=null&&!name.equals("")
        &&age!=null&&!age.equals("")&&color!=null&&!color.equals("")) {
            cat = new Cat(name, age, color);
            printWriter.write(cat.toString());
        }
        else printWriter.write("No data");
    }
}
