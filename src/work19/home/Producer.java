package work19.home;

public class Producer implements Runnable{
   Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            shop.makeProduct();
        }
    }
}
