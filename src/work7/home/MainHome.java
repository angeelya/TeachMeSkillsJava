package work7.home;

import work7.home.task1.Accountant;
import work7.home.task1.Director;
import work7.home.task1.Employee;
import work7.home.task2.Circle;
import work7.home.task2.Figure;
import work7.home.task2.Rectangle;
import work7.home.task2.Triangle;
import work7.home.taskStar.WorkWithCloneable;

public class MainHome {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Task1");
        informationOfCompanyPost();
        System.out.println("Task2");
        geometryFigure();
        System.out.println("Task*");
        cloneClass();
    }

    private static void cloneClass() throws CloneNotSupportedException {//task*
        WorkWithCloneable workWithCloneable = new WorkWithCloneable();
        WorkWithCloneable cloneWorkWithCloneable;
        cloneWorkWithCloneable = workWithCloneable.clone();
        System.out.println(cloneWorkWithCloneable.text);
    }

    private static void geometryFigure() {//task2

        Figure[] figures = new Figure[5];
        figures[0] = new Circle(12);
        figures[1] = new Rectangle(15, 25);
        figures[2] = new Triangle(12, 14, 10, 0.2);
        figures[3] = new Rectangle(12, 45);
        figures[4] = new Circle(34);
        int sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].getPerimeter();
        }
        System.out.println("Sum perimeter of all figures " + sum);
    }

    private static void informationOfCompanyPost() {//task1
        Director director = new Director();
        Accountant accountant = new Accountant();
        Employee employee = new Employee();
        System.out.println(director.getNamePost() + "\n" + accountant.getNamePost() + "\n" + employee.getNamePost());
    }
}
