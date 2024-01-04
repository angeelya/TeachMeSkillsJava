package work31.home.decorator;

public class HomePhone implements Phone{
    @Override
    public void call() {
        System.out.println("Can call by phone");
    }
}
