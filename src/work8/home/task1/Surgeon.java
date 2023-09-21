package work8.home.task1;

public class Surgeon extends Doctor{
    @Override
    protected String treat() {
        return "Hello, "+Surgeon.class.getSimpleName()+" is treating you";
    }
}
