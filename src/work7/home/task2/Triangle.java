package work7.home.task2;

public class Triangle extends Figure{
    double a;
    double b;
    double c;
    double angleAB;

    public Triangle(double a, double b, double c, double angle) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.angleAB = angle;
    }

    @Override
    public double getSquare() {
        return 0.5*a*b* Math.sin(angleAB);
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
