package work31;

import work31.adapter.*;
import work31.decorator.*;
import work31.facade.Computer;
import work31.home.adapter.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1");
        washDishes();
        System.out.println("Practice 2");
        workWithComputer();
        System.out.println("Practice 3");
        createDeveloper();
    }

    private static void createDeveloper() {
        Developer developer = new JuniorDev();
        developer.coding();
        developer = new MiddleDev(developer);
        developer.coding();
        developer = new SeniorDeveloper(developer);
        developer.coding();
        developer= new TeamLead(developer);
        developer.coding();
    }

    private static void workWithComputer() {
        Computer computer = new Computer();
        computer.turnOn();
        computer.turnOff();
    }

    private static void washDishes() {
        DishesShelf dishesShelf = DishesShelf.getInstance();
        Dishes dirtDishes = new DirtDishes(3), cleanDishes= new CleanDishes(4);
        dishesShelf.addDishes(dirtDishes);
        dishesShelf.addDishes(cleanDishes);
        System.out.println(dishesShelf.getDishes(2));
        WashDishes washDishes = new WashDishes((DirtDishes) dirtDishes);
        dishesShelf.addDishes(washDishes);
        System.out.println("Count dishes on the shelf: "+dishesShelf.getCountDishes());
    }

}
