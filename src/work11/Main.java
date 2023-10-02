package work11;

import work11.home.Registration;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static final String MESSAGE_EXCEPTION_ARRAY="There is no animal under this number";
    static final String MESSAGE_ARITHMETIC_EXCEPTION="Division by zero";
    public static void main(String[] args) {
        System.out.println("Practice 1.1-1.3");
        getArrayIndexOutOfBoundAndFixThat();
        System.out.println("Practice 2");
        getPersonException();
        System.out.println("Practice 3");
        workWithAnimal();
    }

    private static void workWithAnimal() {
        Map<String, Integer> animals = new HashMap<>();
        animals.put("rabbit",5);
        animals.put("dog",2);
        animals.put("horse",6);
        animals.put("cow",10);
        FarmAnimals farmAnimals = new FarmAnimals(animals,"Ivan","Friendly animals");
        farmAnimals.getCountOfAnimalsByType("cg");
        farmAnimals.calculateHowMuchFoodWillOneAnimalOfThisType(15,"cow");
        farmAnimals.sellAnimalsOfThisType(-1,"cow");
        farmAnimals.addAnimalOfThisType(10,"cow");
    }

    private static void getPersonException() {
        try {
            Person person= new Person(19);
            System.out.println("Person's age: "+person.getAge());
            Person person1 = new Person(14);
            System.out.println("Person's age: "+person1.getAge());
        } catch (PersonException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void getArrayIndexOutOfBoundAndFixThat() {
        System.out.println("Enter number for getting animal");
        String animal;
        if (in.hasNextInt()) {
           int number = in.nextInt();
            String[] mas = {"rabbit", "dog", "cat", "mouse"};
            try {
                animal = mas[number];
                animal+="is your chosen animal";
                System.out.println(animal);
                number=number/0;
            } catch (ArrayIndexOutOfBoundsException e)//множественный выбор
            {
                System.out.println(MESSAGE_EXCEPTION_ARRAY);
            }
            catch (ArithmeticException e)
            {
                System.out.println(MESSAGE_ARITHMETIC_EXCEPTION);
            }
           /* catch (ArrayIndexOutOfBoundsException|ArithmeticException e) {//мульти try-catch
                String result =switch (e.getClass().getSimpleName())
                {
                    case "ArithmeticException"->MESSAGE_EXCEPTION_ARRAY;
                    case "ArrayIndexOutOfBoundsException"->MESSAGE_ARITHMETIC_EXCEPTION;
                    default -> "";
                };
                System.out.println(result);
            }*/
        } else System.out.println("this isn't integer");
    }

}
