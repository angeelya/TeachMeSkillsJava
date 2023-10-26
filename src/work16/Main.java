package work16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1");
        workWithTextUnit();
        System.out.println("Practice 2");
        workWithRecord();
        System.out.println("Practice 3");
        workWithSealedClasses();
    }


    private static void workWithSealedClasses() {
        ArrayList<Fruit> fruits = new ArrayList<>(Arrays.asList(new Apple("red"), new Banana("yellow"), new Orange("orange")));
     System.out.println(fruits);

    }

    private static void workWithRecord() {
        Person person = new Person("Ivan", 21);//it's record
        System.out.println(person);
    }

    private static void workWithTextUnit() {
        var str = """
                <person> IVAN </person>
                """;
        System.out.println(str + "\n" +
                str.indent(9));// отступ на 9 пробелов
    }
}

