package work29.dependency_inversion.before;

public class BuyService {
    public  void buy(Food food)
    {
        System.out.println("Purchase completed. You bought "+ food.getName());
    }
}
