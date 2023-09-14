package work7.home.task1;

public class Director implements Name{
    @Override
    public String getNamePost() {
        return Director.class.getSimpleName();
    }
}
