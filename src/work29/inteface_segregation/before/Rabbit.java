package work29.inteface_segregation.before;

public class Rabbit implements AnimalsAction{
    @Override
    public void fly() {

    }
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

    @Override
    public void howl() {

    }
}
