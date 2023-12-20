package work29.liskov_substitution.before;

public class Food extends Product {
    @Override
    public void eat() {
        System.out.println("Can eat this");
    }

    @Override
    public void drink() {
        throw new RuntimeException("It isn't drink");
    }

    @Override
    public void wear() {
        throw new RuntimeException("It isn't wear");
    }
}
