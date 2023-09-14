package work7.home.task1;

public class Employee implements Name {
    @Override
    public String getNamePost() {
        return Employee.class.getSimpleName();
    }
}
