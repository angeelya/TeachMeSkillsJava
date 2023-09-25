package work9.home.task2;

import work9.home.task1.Animal;

public class Dog2 extends Animal {
    @Override
    public String voice() {
        return "Woof";
    }

    private Dog2() {
    }

    @Override
    public void eat(String food) {
        if(food.equalsIgnoreCase("meat"))
            System.out.println("Dog like meat");
        else System.out.println("Dog doesn't like "+food);
    }
}
