package work9.home.task1;

public class Tiger extends Animal{
    @Override
    public String voice() {
        return "Roar";
    }

    @Override
    public void eat(String food) {
        if(food.equalsIgnoreCase("meat"))
            System.out.println("Tiger like meat");
        else System.out.println("Tiger doesn't like "+food);
    }
}
