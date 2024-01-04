package work31.decorator;

public class TeamLead extends DecoratorDeveloper{
    public TeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public void coding() {
        System.out.println("Team lead is managing the development process");
    }
}
