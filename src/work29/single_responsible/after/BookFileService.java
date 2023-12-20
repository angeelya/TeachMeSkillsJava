package work29.single_responsible.after;

import java.util.ArrayList;
import java.util.List;

public class BookFileService {
    public void save(String path, BookObject book)
    {
        System.out.println("The book saved to the file "+path);
    }
    public List<BookObject> getAllBook(String path)
    {   List<BookObject> bookList = new ArrayList<>();
        System.out.println("Books got from the file");
        return bookList;
    }
}
