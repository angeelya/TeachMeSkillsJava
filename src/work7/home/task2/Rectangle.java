package work7.home.task2;

public class Rectangle extends Figure {
    double a;
    double b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public double getSquare() {
        return a*b;
    }
}
