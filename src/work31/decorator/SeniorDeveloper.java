package work31.decorator;

public class SeniorDeveloper extends DecoratorDeveloper{
    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void coding() {
        System.out.println("Senior is coding and performing code  review");
    }
}
