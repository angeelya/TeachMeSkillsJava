package work26;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/save_request")
public class Servlet extends HttpServlet {
    private String name, email, city, number;
    private Pattern patternEmail, patternNumber;
    private PrintWriter printWriter;

    @Override
    public void init() throws ServletException {
        patternEmail = Pattern.compile("[\\w-._%+-]+@[A-z\\d-]+.[a-z]{2,9}");
        patternNumber = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        name = req.getParameter("name");
        printWriter = resp.getWriter();
        email = req.getParameter("email");
        city = req.getParameter("city");
        number = req.getParameter("number");
        if (!name.isEmpty() && !email.isEmpty() && !city.isEmpty() && !number.isEmpty()) {
            Matcher matcherEmail = patternEmail.matcher(email), matcherNumber = patternNumber.matcher(number);
            if(matcherEmail.find()&&matcherNumber.find())
            {
                printWriter.write("Successful \n Name: "+name+"\nE-mail: "+email+"\nCity "+city+"\nNumber: "+number);
            }
            else {
               failure("Incorrect email or number", resp);
            }
        }
        else {
          failure("Some field are empty",resp);
        }
    }

    private void failure(String error, HttpServletResponse resp) throws IOException {

        resp.sendRedirect("save-request.jsp?error="+error);
    }
}
