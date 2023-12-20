package work29.liskov_substitution.before;

public class Clothes extends Product {
    @Override
    public void eat() {
        throw new RuntimeException("It isn't eat");
    }

    @Override
    public void drink() {
        throw new RuntimeException("It isn't drink");
    }

    @Override
    public void wear() {
        System.out.println("Can wear this");
    }
}
