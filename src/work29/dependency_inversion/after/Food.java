package work29.dependency_inversion.after;

public class Food implements Product {
    private String name;
    private String color;
    private String flavor;
    private String form;

    public Food(String name, String color, String flavor, String form) {
        this.name = name;
        this.color = color;
        this.flavor = flavor;
        this.form = form;
    }
    @Override
    public String getName() {
        return name;
    }
}
