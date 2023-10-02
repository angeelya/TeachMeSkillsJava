package work11;

public class Person {
   private int age;

    public Person(int age) throws PersonException {
        if(age<18) throw new PersonException("Person is under 18 years old");
        else this.age=age;
    }

    public int getAge() {
        return age;
    }
}
