package work6;

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk(String text) {
        System.out.println(fullName + " talk " + text);
    }

    public void move() {
        System.out.println(fullName + " walk");
    }
}
