package work14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Practice 1");
        getNameDayOfWeek();
        System.out.println("Practice 2");
        getNextTuesday();
        System.out.println("Practice 3");
        workWithFunctionalInterface();
        System.out.println("Practice 4");
        workWithLambdaExpression();
        System.out.println("Practice 5");
        isPositiveOrNegativeNumberOrZero();
        System.out.println("Practice 6");
        checkStringStartOnJOrNAndEndOnA();
    }

    private static void checkStringStartOnJOrNAndEndOnA() {
        String sl="NORA";
        Predicate<String> predicate = str->(str.startsWith("J") || str.startsWith("N"))&&str.endsWith("A");
        System.out.println("Do line begin with J or N and end with A? "+predicate.test(sl));
    }

    private static void isPositiveOrNegativeNumberOrZero() {
        Function<Integer, String> function = x -> {
            if (x > 0) return "Positive number";
            else if (x < 0) return "Negative number";
            else return "Zero";
        };
       System.out.println(function.apply(-8));
    }


    private static void workWithLambdaExpression() {
        CompareAB compareAB = ((a, b) -> {
            if (a < b) return a;
            else if (a > b) return b;
            else return 0;
        });
        System.out.println(compareAB.compareAB(5, 9));
    }

    private static void workWithFunctionalInterface() {
        IShape squareRectangle = ((a, b) -> a * b), squareTriangle = ((a, h) -> 0.5 * a * h);

        System.out.println("Triangle square:" + squareTriangle.getSquare(2, 4) + "\nRectangle square: " + squareRectangle.getSquare(7, 8));
    }

    private static void getNextTuesday() {
        System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
    }


    private static void getNameDayOfWeek() {
        try {
            System.out.println("Enter date, example 2023-07-21");
            String date = in.nextLine();
            System.out.println(LocalDate.parse(date).getDayOfWeek());
        } catch (DateTimeParseException e) {
            System.out.println("Incorrect data entry");
        }

    }
}
