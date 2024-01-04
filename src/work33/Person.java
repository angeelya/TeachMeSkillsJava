package work33;

import java.math.BigDecimal;
import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private Integer age;
    private Double wage;
    private Cat cat;


    public Person(String name, Integer age, Double wage, Cat cat) {
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.cat = cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public Cat getCat() {
        return cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wage=" + wage +
                ", cat=" + cat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(wage, person.wage);
    }

    @Override
    public int hashCode() {
        int res = 0;
        res += 12 * res + name.hashCode() + age.hashCode() + wage.hashCode() + cat.hashCode();
        return res;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person clonePerson = (Person) super.clone();
        clonePerson.cat = this.cat.clone();
        return clonePerson;
    }
}
