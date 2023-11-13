package work19.home;

public class Shop {
    private int countProduct=0;
    public synchronized void  makeProduct()
    {
        while (countProduct>=3)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        countProduct++;
        System.out.println("Product is made. Count: "+countProduct);
        notify();
    }
    public synchronized void buyProduct()
    {
        while(countProduct==0)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        countProduct--;
        System.out.println("Product is sold. Count: "+countProduct);
        notify();
    }
}
