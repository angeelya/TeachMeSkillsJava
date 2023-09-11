package work6.home;

public class CreditCard {
    String numberAccount;
    Double actualSum;

    public CreditCard(String numberAccount, Double actualSum) {
        this.numberAccount = numberAccount;
        this.actualSum = actualSum;
    }

    public void addSum(Double sum)
    {
        actualSum+=sum;
    }
    public void minusSum(Double minusSum)
    {
        actualSum-=minusSum;
    }
    public String actualInformation()
    {
       return "Number account:"+numberAccount+"\n Actual sum: "+actualSum;
    }

}
