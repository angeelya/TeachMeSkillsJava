package work29.inteface_segregation.before;

import work13.home.Animal;

public class Wolf implements AnimalsAction {
    @Override
    public void fly() {

    }

    @Override
    public void eat() {
        System.out.println("Wolf can eat");
    }

    @Override
    public void run() {
        System.out.println("Wolf can run");
    }

    @Override
    public void jump() {
        System.out.println("Wolf can jump");
    }

    @Override
    public void howl() {
        System.out.println("Wolf can howl");
    }
}
