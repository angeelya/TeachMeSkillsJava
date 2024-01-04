package work31.home.decorator;

public class MobilePhone extends DecoratorPhone{
    public MobilePhone(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        System.out.println("Can make phone calls wireless");
    }
    public void playGames()
    {
        System.out.println("Can play games");
    }
}
