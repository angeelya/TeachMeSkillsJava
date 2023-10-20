package work14.home;

import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task1");
        getCenturyDate();
        System.out.println("Task2");
        getPositiveNumbers();

        System.out.println("Enter sum, BYN");
        String sum = in.nextLine() + " BYN";
        System.out.println("Task3");
        getDollarsUsingFunction(sum);
        System.out.println("Task4");
        getDollarsUsingConsumer(sum);
        System.out.println("Task5");
        workWithSupplier();
    }

    private static void workWithSupplier() {//task5
        Supplier<String> getReverseString = () -> {
            System.out.println("enter string");
            StringBuilder stringBuilder = new StringBuilder(in.nextLine());
            return stringBuilder.reverse().toString();
        };
        System.out.println(getReverseString.get());
    }



    private static void getDollarsUsingConsumer(String sum) {//task4
        Consumer<String> getDollars = strByn -> {
            strByn = strByn.split(" ")[0];
            try {
                double dollars = Double.parseDouble(strByn) * (1 / 3.29);
                System.out.println("BYN:" + strByn + " Dollars:" + dollars);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect sum");
            }
        };
        getDollars.accept(sum);
    }


    private static void getDollarsUsingFunction(String sum) {//task3
        Function<String, String> getDollars = strByn -> {
            strByn = strByn.split(" ")[0];
            try {
                double dollars = Double.parseDouble(strByn) * (1 / 3.29);
                return String.valueOf(dollars);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect sum");
            }
            return "Incorrect";
        };
        System.out.println("BYN:" + sum + " Dollars:" + getDollars.apply(sum));

    }


    private static void getPositiveNumbers() {//task2
        List<Integer> mas = Arrays.asList(-4, 5, 6, 7, 0, -8, 6, 5, 3);
        Predicate<Integer> predicate = x -> x > 0;
        mas = mas.stream().filter(predicate).toList();
        System.out.println(mas);
    }



    private static void getCenturyDate() {//task1
        try {
            System.out.println("Enter birthday's date, example 2023-07-21");
            String dateString = in.nextLine();
            LocalDate date = LocalDate.parse(dateString);
            date = date.plusYears(100);
            System.out.println("you will be 100: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect data entry");
        }
    }
}
