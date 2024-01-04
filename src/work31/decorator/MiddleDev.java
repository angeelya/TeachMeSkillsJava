package work31.decorator;

public class MiddleDev extends DecoratorDeveloper{
    public MiddleDev(Developer developer) {
        super(developer);
    }

    @Override
    public void coding() {
        System.out.println("Middle is coding and writing tests");
    }
}
