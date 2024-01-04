package work31.adapter;

public class Dishes {
    private int count;

    public Dishes(int count) {
        this.count = count;
    }

    public int getCountDishes()
    {
        return count;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "count=" + count +
                '}';
    }
}
