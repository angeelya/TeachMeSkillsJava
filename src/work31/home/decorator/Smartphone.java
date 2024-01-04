package work31.home.decorator;

public class Smartphone extends MobilePhone{
    public Smartphone(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
       super.call();
       System.out.println("And call over the Internet");
    }
    public void takePhoto()
    {
        System.out.println("Can take a photo");
    }
    public void surfInternet()
    {
        System.out.println("Can surf the Internet");
    }
    public void playGames()
    {
       super.playGames();
    }
}
