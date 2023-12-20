package work29.inteface_segregation.after;

public class Rabbit implements Eat,Run,Jump{
    @Override
    public void eat() {
        System.out.println("Rabbit can eat");
    }

    @Override
    public void run() {
        System.out.println("Rabbit can run");
    }

    @Override
    public void jump() {
        System.out.println("Rabbit can jump");
    }
}
