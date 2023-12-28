package work30.Factory;

import work30.Factory.Developer;

public class JavaDev implements Developer {
    @Override
    public void develop() {
        System.out.println("I develop a program in Java");
    }
}
