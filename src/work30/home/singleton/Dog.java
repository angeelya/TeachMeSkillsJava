package work30.home.singleton;

public class Dog {
    private static Dog dog;

    private Dog() {
    }

    public static Dog getInstance() {
        if (dog == null) {
            dog = new Dog();
        }
        return dog;
    }
}
