package work6;

public class Calculator {
    double weight = 54;
    double cost = 1.2;
    String color = "white";
    double a, b;
    {
        System.out.println("Create instance of the class Calculator");
    }

    public Calculator(double weight, double cost, String color, double a, double b) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
        this.a = a;
        this.b = b;
    }

    public void divide() {
        if (b != 0)
            System.out.println(a / b);
        else System.out.println("division by zero");
    }

    public void add() {
        System.out.println(a + b);
    }

    public void multiplication() {
        System.out.println(a * b);
    }

    public void subtraction() {
        System.out.println(a - b);
    }
}
