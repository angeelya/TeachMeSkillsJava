package work33;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Alisa", 23, 44.4,new Cat("Lisa"));
        Person clone = person.clone();
        System.out.println(clone.equals(person));
        clone.setName("Anna");
        System.out.println(clone);
        System.out.println(person);
    }
}
