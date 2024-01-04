package work31.decorator;

public abstract class DecoratorDeveloper implements Developer {
    protected Developer developer;

    public DecoratorDeveloper(Developer developer) {
        this.developer = developer;
    }
    public void coding()
    {
        developer.coding();
    }
}
