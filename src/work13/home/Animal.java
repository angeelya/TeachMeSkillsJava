package work13.home;

import java.util.Arrays;
import java.util.LinkedList;

public class Animal {
    private LinkedList<String> animals = new LinkedList<>();

    public void printAnimals() {
        System.out.println(Arrays.toString(animals.toArray()));
    }

    public void  setAnimal(String animal)
    {
        animals.addFirst(animal);
        System.out.println("Add animal");
    }
    public void deleteLastAnimal()
    {
        animals.removeLast();
        System.out.println("Remove last animal");
    }
}
