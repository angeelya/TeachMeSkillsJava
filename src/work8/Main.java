package work8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1");
        House house = new House();
        Garage garage = new Garage();
        System.out.println("Build: "+house.getType()+" and "+garage.getType());
        System.out.println("Practice 2");
        Person person = new Person("Angelina",21,"woman");
        System.out.println("Name: "+person.name+"\nAge: "+person.age+"\nGender: "+person.getGender());

    }
}
