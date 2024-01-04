package work31.home;

import work31.home.adapter.*;
import work31.home.decorator.DecoratorPhone;
import work31.home.decorator.HomePhone;
import work31.home.decorator.MobilePhone;
import work31.home.decorator.Smartphone;
import work31.home.facade.Kettle;
import work31.home.observer.Flower;
import work31.home.observer.Mother;
import work31.home.observer.Person;
import work31.home.observer.Son;
import work31.home.strategy.Game;
import work31.home.strategy.Strategy;
import work31.home.strategy.Strategy1;
import work31.home.strategy.Strategy2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        phoneAdapter();
        System.out.println("Task 2");
        facadeWorkKettle();
        System.out.println("Task 3");
        decoratorPhone();
        System.out.println("Task *");
        gamesStrategy();
        System.out.println("Task **");
        observerFlower();
    }

    private static void observerFlower() {
        Flower flower = new Flower();
        Person mother = new Mother(), son = new Son();
        flower.addPerson(mother);
        flower.addPerson(son);
        flower.notifyPersonAboutWatering();
    }

    private static void gamesStrategy() {
        Strategy strategy1 = new Strategy1(), strategy2 = new Strategy2();
        Game game1 = new Game(strategy1), game2= new Game(strategy2);
        game1.getStrategy();
        game2.getStrategy();
    }

    private static void decoratorPhone() {
        work31.home.decorator.Phone phone = new HomePhone();
        phone = new MobilePhone(phone);
        phone = new Smartphone(phone);
        phone.call();
    }

    private static void facadeWorkKettle() {
        Kettle kettle = new Kettle(55);
        kettle.turnOn();
    }

    private static void phoneAdapter() {
        Phone phoneWithLightning = new PhoneWithLightning(), phoneWithTypeC= new PhoneWithTypeC();
        Charger lightning = new Lightning(true), typeC = new TypeC(true);
        phoneWithLightning.fits(typeC);
        phoneWithTypeC.fits(typeC);
        AdapterTypeCLightning adapterTypeCLightning = new AdapterTypeCLightning((TypeC) typeC);
        AdapterLightningTypeC adapterLightningTypeC = new AdapterLightningTypeC((Lightning) lightning);
        phoneWithLightning.fits(adapterTypeCLightning);
        phoneWithTypeC.fits(adapterLightningTypeC);
    }
}
