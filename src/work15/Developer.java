package work15;

public class Developer {
   private int id;

    public int getId() {
        return id;
    }

    public Developer( String name, int id) {
        this.id=id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
