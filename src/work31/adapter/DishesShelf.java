package work31.adapter;

public class DishesShelf {
    private Integer countDishes = 0;
    private static DishesShelf dishesShelf;

    private DishesShelf() {

    }

    public static DishesShelf getInstance() {
        if (dishesShelf == null) dishesShelf = new DishesShelf();
        return dishesShelf;
    }

    public void addDishes(Dishes dishes) {
        if (dishes instanceof CleanDishes) {
            countDishes += dishes.getCountDishes();
        } else System.out.println("Dishes don't fit");
    }

    public CleanDishes getDishes(int count) {
        if (countDishes >= count) {
            countDishes -= count;
            return new CleanDishes(count);
        } else return new CleanDishes(0);
    }

    public Integer getCountDishes() {
        return countDishes;
    }
}
