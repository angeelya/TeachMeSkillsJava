package work31.adapter;

public class DirtDishes extends Dishes{

    public DirtDishes(int count) {
        super(count);
    }

    @Override
    public String toString() {
        return "Dirt"+super.toString();
    }
}
