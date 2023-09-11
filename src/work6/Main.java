package work6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1.1-1.3");
        Calculator calculator = new Calculator(50,1.4,"black",2.1,7.8);
        System.out.println("Weight: "+calculator.weight+"\n"+"Color: "+calculator.color+"\n"+"Cost: "+calculator.cost);
        System.out.println("Practice 2");
        Person person = new Person();
        person.talk("Hello");
        person.move();
        Person person1 = new Person("Angelina",21);
        person1.talk("Hello");
        person1.move();
    }
}
