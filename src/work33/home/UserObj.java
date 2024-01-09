package work33.home;

public class UserObj implements Cloneable {
    private Long id;
    private String name;
    private Cat cat;

    public UserObj(Long id, String name, Cat cat) {
        this.id = id;
        this.name = name;
        this.cat = cat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public UserObj cloneDeep() throws CloneNotSupportedException {
        UserObj user= (UserObj) super.clone();
        user.cat=this.cat.clone();
        return user;
    }

    @Override
    protected UserObj clone() throws CloneNotSupportedException {
        return (UserObj) super.clone();
    }

    @Override
    public String toString() {
        return "UserObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }
}
