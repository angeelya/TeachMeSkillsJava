package work11.home;

public class MainHome {
    public static void main(String[] args) {
        System.out.println("task1");
        Registration.registerInSystem("alise34","wer4","wer94");
        System.out.println("task*");
        getFinallyDoNotWork(0);
    }

    private static void getFinallyDoNotWork(int k) {
        try{
            System.out.println("5/"+k+" Whole part: "+5/k+" Remainder of the division: "+5%k);
            System.exit(0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero");
            System.exit(0);
        }
        finally {
            System.out.println("Finally work");
        }
    }
}
