package work7.home.task1;

public class Accountant implements Name{
    @Override
    public String getNamePost() {
        return Accountant.class.getSimpleName();
    }
}
