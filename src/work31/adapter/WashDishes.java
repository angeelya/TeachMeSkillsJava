package work31.adapter;

public class WashDishes extends CleanDishes{
    public WashDishes(DirtDishes dirtDishes) {
        super(dirtDishes.getCountDishes());
    }
}
