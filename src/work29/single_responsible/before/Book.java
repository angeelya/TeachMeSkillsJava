package work29.single_responsible.before;

public class Book {
    private String name;
    private String author;
    private int countOfPage;

    public Book(String name, String author, int countOfPage) {
        this.name = name;
        this.author = author;
        this.countOfPage = countOfPage;
    }

    public void save()
    {
        System.out.println("The book saved to the file");
    }
    public void getAllBook()
    {
        System.out.println("Books got from the file");
    }
}
