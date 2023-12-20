package work29.inteface_segregation.before;

public class Crow implements AnimalsAction{
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

    @Override
    public void jump() {

    }

    @Override
    public void howl() {

    }
}
