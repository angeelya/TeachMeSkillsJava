package work30.Factory;

import work30.Factory.Developer;

public class JsDev implements Developer {
    @Override
    public void develop() {
        System.out.println("I develop a program in JS");
    }
}
