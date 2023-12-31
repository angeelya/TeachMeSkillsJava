package work13;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1");
        workWithArrayList();
        System.out.println("Practice 2");
        workWithLinkedList();
        System.out.println("Practice 3");
        workWithHashSet();
        System.out.println("Practice 4");
         workWithGenericClass();
    }

    private static void workWithGenericClass() {
        Storage<String> stringStorage = new Storage<>();
        Storage<Integer> integerStorage = new Storage<>(12345);
        stringStorage.setData("Hello");
        System.out.println(stringStorage.getData());
        System.out.println(integerStorage.getData());
    }

    private static void workWithHashSet() {
        HashSet<Person> people = new HashSet<>();// pr 3.1-2
        Person person1 = new Person("Ivan"), person2 = new Person("Alisa"), person3 = new Person("Irina");// pr 3.3
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.forEach(person->System.out.println(person));
        people.remove(person1);//pr 3.4
        people.remove(person2);
        System.out.println(people);
        System.out.println("Do person 2 contain?"+people.contains(person2));//pr 3.5
    }

    private static void workWithLinkedList() {
        LinkedList<String> countries = new LinkedList<>();//pr 2.1
        countries.addFirst("Belarus");//pr 2.2
        countries.addFirst("France");
        countries.addLast("Germany");
        countries.addLast("Turkey");
        System.out.println(countries);
        countries.removeFirst();// pr 2.3
        System.out.println(countries);
        countries.removeLast();
        System.out.println(countries);
        System.out.println(countries.getFirst());//pr 2.4
        System.out.println(countries.getLast());
    }

    private static void workWithArrayList() {
        ArrayList<String> arrayCountries = new ArrayList<>();//pr 1.1
        arrayCountries.add("Belarus");//pr 1.2
        arrayCountries.add("South Korea");
        arrayCountries.add("Russia");
        System.out.println(arrayCountries);
        arrayCountries.set(1, "USA");//pr 1.3
        System.out.println(arrayCountries);
        arrayCountries.remove(1);//pr 1.4
        System.out.println(Arrays.toString(arrayCountries.toArray()));
        arrayCountries.remove("Russia");//pr 1.5
        System.out.println(arrayCountries);
        System.out.println("Number of Belarus " + arrayCountries.indexOf("Belarus")); //pr 1.6
        System.out.println("Does Belarus contain? " + arrayCountries.contains("Belarus"));//pr 1.7
    }
}
