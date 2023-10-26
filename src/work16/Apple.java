package work16;

public non-sealed class Apple extends Fruit {

    public Apple(String color) {
    super(color);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + getColor() + '\'' +
                '}';
    }

}
