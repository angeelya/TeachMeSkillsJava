package work9.home.task1;

public class Dog extends Animal{
    @Override
    public String voice() {
        return "Woof";
    }

    @Override
    public void eat(String food) {
        if(food.equalsIgnoreCase("meat"))
            System.out.println("Dog like meat");
        else System.out.println("Dog doesn't like "+food);
    }
}
