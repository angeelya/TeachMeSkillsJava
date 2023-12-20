package work29.dependency_inversion.before;

public class Food {
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

    public String getName() {
        return name;
    }
}
