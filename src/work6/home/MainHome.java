package work6.home;

public class MainHome {
    public static void main(String[] args) {
        System.out.println("Task1");
        CreditCard card1 = new CreditCard("3534564gff",120.4);
        CreditCard card2 = new CreditCard("he1455y774",323.5);
        CreditCard card3 = new CreditCard("rtx5667h7",209.7);
        card1.addSum(23.5);
        card2.addSum(34.5);
        card3.minusSum(78.0);
        System.out.println("Actual information\n"+"Card1: "+card1.actualInformation()+"\n Card2: "
        +card2.actualInformation()+"\n Card3: " +card3.actualInformation());
       System.out.println("Task2");
       Atm atm = new Atm(0,20,120);
       atm.addCash(0,0,0);
       atm.outputCash(260);

    }
}
