package work11.home;

public class MainHome {
    public static void main(String[] args) {
        System.out.println("task1");
        Registration.registerInSystem("alise34", "wer", "wer");
        System.out.println("task*");
        getFinallyDoNotWork(0);
    }

    private static void getFinallyDoNotWork(int k) {
        try {
            System.out.println("5/k = whole part: " + 5 / k + " Remainder of division: " + 5 % k);
            for (; ; ) {
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
            while (true) {
            }

        } finally {
            System.out.println("Finally work");
        }
    }


}
