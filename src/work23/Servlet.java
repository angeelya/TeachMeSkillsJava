package work23;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet(urlPatterns = {"/upload", "/book", "/load-book"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 10)
public class Servlet extends HttpServlet {
    private String path, fileName;
    private final String PATH = "C:/Users/Angelina/archive_book/";

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        path = req.getServletPath();
        if (path.equals("/upload") || path.equals("/load-book"))
            try {
                Part filePart = req.getPart("file");
                String name = filePart.getSubmittedFileName();
                filePart.write(PATH + name);
                resp.getWriter().print("The file uploaded successfully.");
            } catch (IOException e) {
                resp.getWriter().print("Something wrong." + e.getMessage());
            }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        path = req.getServletPath();
        if (path.equals("/book")) {
            fileName = req.getParameter("fileName");
            File file = new File(PATH + "/" + fileName);
            FileInputStream fileInputStream = new FileInputStream(file);
            OutputStream outputStream = resp.getOutputStream();
            resp.setContentType("text/plain");
            resp.setHeader("Content-Disposition", "attachment; filename=\"" + new String(fileName.getBytes("UTF-8"), "ISO-8859-1"));
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            outputStream.flush();
            outputStream.close();
            fileInputStream.close();
        }
    }
}

