package work9.home;

import work9.home.task1.Animal;
import work9.home.task1.Dog;
import work9.home.task1.Rabbit;
import work9.home.task1.Tiger;
import work9.home.task2.Dog2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainHome {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("Task 1");
        Animal rabbit = new Rabbit();
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        tiger.eat("grass");
        dog.eat("meat");
        rabbit.eat("Grass");
        System.out.println("Task*");
        createInstanceDog2();
    }

    private static void createInstanceDog2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?> constructorDog = Dog2.class.getDeclaredConstructor();//получаем конструктор
        constructorDog.setAccessible(true);// делаем доступным приватный конструктор
        Dog2 dog2 = (Dog2) constructorDog.newInstance();// создем обьект
        System.out.println(dog2.voice());
        dog2.eat("grass");
    }
}
