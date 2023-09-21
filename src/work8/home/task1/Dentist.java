package work8.home.task1;

public class Dentist extends Doctor{
    @Override
    protected String treat() {
        return "Hello, "+Dentist.class.getSimpleName()+" is treating you";
    }
}
