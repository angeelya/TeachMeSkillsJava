package work32.home.data_transfer_object;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/account")
public class Servlet extends HttpServlet {
    private PrintWriter printWriter;
    private Account account;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        printWriter = resp.getWriter();

        String from = req.getParameter("from"), to = req.getParameter("to");
        try {
            Integer sum = Integer.valueOf(req.getParameter("sum"));
            if(from!=null&&!from.isEmpty()&&to!=null&&!to.isEmpty()&&sum!=null)
            {
                account= new Account(from,to,sum);
                printWriter.write(account.toString());
            }
            else printWriter.write("Empty field");
        }
        catch (NumberFormatException e)
        {
            printWriter.write("Incorrect sum");
        }
    }
}
