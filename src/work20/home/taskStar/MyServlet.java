package work20.home.taskStar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", urlPatterns = {"/get", "/create", "/change-login", "/delete"})
public class MyServlet extends HttpServlet {
    private Service service;
    private String path;
    private PrintWriter printWriter;

    @Override
    public void init() throws ServletException {
        super.init();
        service = new Service();
        service.createTable();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        path = req.getServletPath();
        printWriter = resp.getWriter();
        String id, login;
        if (path.equals("/get")) {
            resp.setContentType("text/html");
            id = req.getParameter("id");
            if (id != null && !id.isEmpty()) {
                UsersApp usersApp = service.getByIdUser(id);
                if (usersApp != null) {
                    printWriter.write("<h2> User Information</h2>");
                    printWriter.write("<p> User id: " + usersApp.getId() + "</p>");
                    printWriter.write("<p> Login: " + usersApp.getLogin() + "</p>");
                    printWriter.write("<p> Age: " + usersApp.getAge() + "</p>");
                } else printWriter.write("Table row is empty");
            } else printWriter.write("No id in the address");
        } else if (path.equals("/change-login")) {
            id = req.getParameter("id");
            login = req.getParameter("login");
            System.out.println(login + id);
            if (id != null && !id.isEmpty() && login != null && !login.isEmpty()) {
                printWriter.write(service.updateLogin(id, login));
            } else printWriter.write("Data is empty");
        } else if (path.equals("/delete")) {
            id = req.getParameter("id");
            if (id != null && !id.isEmpty()) {
                printWriter.write(service.deleteById(id));
            } else printWriter.write("Id is empty");
        }
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        path = req.getServletPath();
        System.out.println(path);
        UsersApp usersApp = new UsersApp();
        printWriter = resp.getWriter();
        if (path.equals("/create")) {
            usersApp.setLogin(req.getParameter("login"));
            usersApp.setAge(Integer.valueOf(req.getParameter("age")));
            printWriter.write(service.putUser(usersApp));
        }
        printWriter.close();
    }
}