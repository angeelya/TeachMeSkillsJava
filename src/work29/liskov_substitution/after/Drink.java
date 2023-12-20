package work29.liskov_substitution.after;

public class Drink extends Product {
    @Override
    public void buy() {
        System.out.println("Drink bought");
    }

    @Override
    public void sell() {
        System.out.println("Bring sold out");
    }

    public void drink() {
        System.out.println("Can drink this");

    }
}
