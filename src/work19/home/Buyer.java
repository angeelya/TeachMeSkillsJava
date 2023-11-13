package work19.home;

public class Buyer implements Runnable {
    private Shop shop;

    public Buyer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            shop.buyProduct();
        }
    }
}
