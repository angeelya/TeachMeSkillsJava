package work29.liskov_substitution.before;

public class Drink extends Product{
    @Override
    public void eat() {
        throw new RuntimeException("It isn't eat");
    }

    @Override
    public void drink() {
        System.out.println("Can drink this");
    }

    @Override
    public void wear() {
        throw new RuntimeException("It isn't wear");
    }
}
