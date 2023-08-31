import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

/*       System.out.println("Practice 1. Time of the year: "+ findTimeYear());

       System.out.println("Practice 2: "+output());

       System.out.println("Practice 3: "+ outputEvenNumber());

       System.out.println("Practice 4. " + calculationTotal());

       System.out.println("Practice 5.");
       cycleMultiplication();
       System.out.println("Practice 6.");
       findMax();
       System.out.println("Practice 7.");
       tableMultiplication();*/
        Home home = new Home();
        System.out.println("Task1 ");
        home.isEvenNumberOrNo();
        System.out.println("Task2 ");
        home.determinationWeather();
        System.out.println("Task3 ");
        home.squareOfNumber();
        System.out.println("Task4 ");
        home.sequenceOfNumber();
        System.out.println("Task* ");
        home.sumToCertainNumber();

    }

    private static void tableMultiplication() {
        for(int i=1; i<11;i++){
            for (int s=1;s<11;s++)
            {
                System.out.println(i+"*"+s+"="+i*s);
            }
        }

    }

    private static void findMax() {
        int [] mas = new int[]{200, 45, 7, 1, 8, 3, 9, 10};
        int t=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
        for (int i=0; i< mas.length;i++)
        {
         if(mas[i]>t)
         {
             t=mas[i];
         }
         else {
             if(mas[i]>s)
             s= mas[i];
         }
        }
        System.out.println("max elements: "+t+" "+s);
    }

    private static void cycleMultiplication() {
        String result;
        while (true)
        {
            System.out.println("Enter number1");
            double n1 = in.nextDouble();
            System.out.println("Enter number2");
            double n2 = in.nextDouble();
            result = String.valueOf(n1*n2);
            System.out.println("Result = "+result+". If you finish program enter 1. Press any to continue");
            int b = in.nextInt();
            if(b==1)
            {break;}
        }
    }

    private static String calculationTotal() {
        System.out.println("Enter sum");
        double sum = in.nextDouble();
        System.out.println("Enter count month");
        int countMonth = in.nextInt();
        for( int i=0;i < countMonth;i++) {
            sum += sum * 0.07;
        }
        return "Result = " + sum;
    }

    private static String outputEvenNumber() {
        String even = "";
        for(int i=2; i<21;i++)
        {
            if(i>=10&&i%2==0)
               even += i+" ";
        }
        return even;
    }

    private static String output() {
        String number="";
        int i =0;
        while(i<26)
        {
            number += String.valueOf(i);
            i++;
       }
        return number ;
    }

    private static String findTimeYear() {
        System.out.println("Enter number month");
        int b= in.nextInt();
        return switch (b){
        case 12,1,2-> "Winter";
        case 3,4,5-> "Spring";
        case 6,7,8-> "Summer";
        case 9,10,11->"Autumn";
        default -> "";
        };
    }
}