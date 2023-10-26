package work16;

public non-sealed class Banana extends Fruit {
    public Banana(String color) {
        super(color);
    }
    @Override
    public String toString() {
        return "Banana{" +
                "color='" + getColor() + '\'' +
                '}';
    }
}
