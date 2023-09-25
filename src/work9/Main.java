package work9;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1");
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        System.out.println(circle.erase() + "\n" + square.draw() + "\n" + triangle.draw());
        System.out.println("Practice 2");
        System.out.print("Class name: "+Person.name+"\nClass name from method: ");
        Person.getName();
    }
}
