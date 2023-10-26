package work16;


public sealed class Fruit permits Apple, Banana, Orange {
    private String color;

    public Fruit(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
