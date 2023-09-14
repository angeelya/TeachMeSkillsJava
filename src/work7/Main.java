package work7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1");
        Voice dog = new Dog();
        Voice cat = new Cat();
        System.out.println("Dog talk " + dog.doVoice());
        System.out.println("Cat talk " + cat.doVoice());
        System.out.println("Practice 2");
        Hp hp = new Hp();
        Mac mac = new Mac();
        System.out.println(hp.getClassName()+"\n"+mac.getClassName());
    }
}
