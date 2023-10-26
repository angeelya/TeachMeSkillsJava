package work16;

public non-sealed class Orange extends Fruit {
    public Orange(String color) {
        super(color);
    }
    @Override
    public String toString() {
        return "Orange{" +
                "color='" + getColor() + '\'' +
                '}';
    }
}
