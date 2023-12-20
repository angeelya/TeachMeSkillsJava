package work29.dependency_inversion.after;

public class BuyService {
    public void buy(Product product)
    {
        System.out.println("Purchase completed. You bought "+ product.getName());
    }
}
