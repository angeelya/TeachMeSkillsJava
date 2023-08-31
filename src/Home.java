import java.util.Scanner;

public class Home {
    Scanner in = new Scanner(System.in);
    int enterNumber;
    public void isEvenNumberOrNo()//task1
    {
        System.out.println("Enter number");
        enterNumber =in.nextInt();
        System.out.println(enterNumber %2==0?"Even number": "Odd number");
    }
    public void determinationWeather()//task2
    {   String weather="";
        System.out.println("Enter temperature");
        enterNumber =in.nextInt();
        if(enterNumber >-5) weather="warm";
        else if (-5>= enterNumber && enterNumber >-20) weather="normal";
        else weather ="cold";
        System.out.println("Weather is "+ weather);
    }
    public void squareOfNumber()//task3
    {
        for(int i=10;i<21;i++)
        {
            System.out.println(i+"^2="+i*i);
        }
    }
    public void sequenceOfNumber()//task4
    {   int t=7;
        String sequence="";
        while(t<100)
        {  sequence+=t+" ";
            t+=7;
        }
        System.out.println(sequence);
    }
    public void sumToCertainNumber()//task*
    {
        System.out.println("Enter positive integer");
        try {
            enterNumber = in.nextInt();
            System.out.println(enterNumber>0?sumNumber():" This isn't positive integer");

        }
        catch (Exception e)
        {
            System.out.println("This isn't integer");
        }

    }

    private String sumNumber() {
        int sum=0;
        for(int i = 1; i<= enterNumber; i++)
        {
            sum+=i;
        }
        return "Result="+sum;
    }
}
