package work29.dependency_inversion.after;

public class Clothes implements Product{
    private String name;
    private String color;
    private String type;

    public Clothes(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }
}
