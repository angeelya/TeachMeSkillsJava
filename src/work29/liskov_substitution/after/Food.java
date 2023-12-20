package work29.liskov_substitution.after;

public class Food extends Product{
    @Override
    public void buy() {
        System.out.println("Food bought");
    }

    @Override
    public void sell() {
        System.out.println("Food sold out");
    }
    public void eat() {
        System.out.println("Can eat this");

    }
}
