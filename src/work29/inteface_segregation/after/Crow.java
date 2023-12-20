package work29.inteface_segregation.after;

public class Crow implements Eat,Fly,Run{
    @Override
    public void fly() {
        System.out.println("Crow can fly");
    }

    @Override
    public void eat() {
        System.out.println("Crow can eat");
    }

    @Override
    public void run() {
        System.out.println("Crow can run");
    }
}
