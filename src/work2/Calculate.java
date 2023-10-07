package work2;

import java.util.Scanner;

public class Calculate {
    double a,b;
    String sign;
    Scanner in = new Scanner(System.in);
    public void init ()
    {
        System.out.println("Enter a ");
        a=in.nextDouble();
        System.out.println("Enter b ");
        b=in.nextDouble();
        System.out.println("Enter sign + or - or / or *");
        sign=in.next();
        switch (sign)
        {
            case "-": subtraction();  break;
            case"+": add();break;
            case"/": divide();break;
            case "*": multiplication(); break;
            default: System.out.println("Incorrect sign. Try again"); init();
        }
    }
    public void divide()
    {  if(b!=0)
        System.out.println(a/b);
        else   System.out.println("division by zero");
    }
    public void add()
    {
        System.out.println(a+b);
    }
    public void multiplication()
    {
        System.out.println(a*b);
    }
    public void subtraction()
    {
        System.out.println(a-b);
    }
}
