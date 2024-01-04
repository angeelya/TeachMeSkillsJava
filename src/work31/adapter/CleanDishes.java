package work31.adapter;

public class CleanDishes extends Dishes{
    public CleanDishes(int count) {
        super(count);
    }

    @Override
    public String toString() {
        return "Clean"+super.toString();
    }
}
