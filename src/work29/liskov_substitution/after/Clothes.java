package work29.liskov_substitution.after;

public class Clothes extends Product{
    @Override
    public void buy() {
        System.out.println("Clothes bought");
    }

    @Override
    public void sell() {
        System.out.println("Clothes sold out");
    }
    public void wear()
    {
        System.out.println("Can wear this");
    }
}
