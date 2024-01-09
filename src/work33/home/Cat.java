package work33.home;

public class Cat implements Cloneable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    protected Cat clone() throws CloneNotSupportedException {
        return (Cat)super.clone();
    }

}
