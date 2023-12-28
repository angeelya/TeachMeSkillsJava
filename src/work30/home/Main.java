package work30.home;

import work30.home.abstract_factory.*;
import work30.home.builder.Order;
import work30.home.factory.ChairFactory;
import work30.home.factory.Furniture;
import work30.home.factory.SofaFactory;
import work30.home.factory.TableFactory;
import work30.home.prototype.Orange;
import work30.home.singleton.Dog;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Dog dog1 = Dog.getInstance(), dog2 = Dog.getInstance();
        System.out.println(dog1 = dog2);
        System.out.println("Task 2");
        abstractBakeryFactory();
        System.out.println("Task 3");
        furnitureFactory();
        System.out.println("Task 4");
        getOrder();
        System.out.println("Task *");
        prototype();

    }

    private static void prototype() {
        Orange orange = new Orange();
        orange.setColor("orange");
        orange.setTaste("sour and sweet");
        orange.setAcidity("0.4%");
        Orange cloneOrange = (Orange) orange.clone();
        System.out.println(orange.equals(cloneOrange));
    }

    private static void getOrder() {
        Order order = new Order.OrderBuilder().nameCustomer("Karina").address("Lenina Street").
                numberOrder("1234rT").cost(new BigDecimal(456.7)).build();
    }

    private static void furnitureFactory() {
        ChairFactory chairFactory = new ChairFactory();
        SofaFactory sofaFactory = new SofaFactory();
        TableFactory tableFactory = new TableFactory();
        Furniture chair = chairFactory.createFurniture(), sofa = sofaFactory.createFurniture(),
                table = tableFactory.createFurniture();
        chair.getFurnitureName();
        sofa.getFurnitureName();
        table.getFurnitureName();
    }

    private static void abstractBakeryFactory() {
        ChocolateBakery chocolateBakeryFactory = new ChocolateBakery();
        AppleBakery appleBakery = new AppleBakery();
        Cookies chocoCookies = chocolateBakeryFactory.bakeCookies(), appleCookies = appleBakery.bakeCookies();
        Cake chocoCake = chocolateBakeryFactory.bakeCake(),appleCake = appleBakery.bakeCake();;
        Pie chocoPie = chocolateBakeryFactory.bakePie(), applePie = appleBakery.bakePie();
        chocoCake.getTaste();
        chocoCookies.getTaste();
        chocoPie.getTaste();
        appleCake.getTaste();
    }
}
