package work9.home.task1;

public class Rabbit extends Animal{
    @Override
    public String voice() {
        return "";
    }

    @Override
    public void eat(String food) {
        if(food.equalsIgnoreCase("grass"))
            System.out.println("Rabbit like grass");
        else System.out.println("Dog doesn't like "+food);
    }
}
