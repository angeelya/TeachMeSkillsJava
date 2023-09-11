package work6.home;

public class Atm {
    int count20, count50, count100;
    int countInSum20 = 0, countInSum50 = 0, countInSum100 = 0;
    boolean successful = true;

    public Atm(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void addCash(int c20, int c50, int c100) {
        count20 += c20;
        count50 += c50;
        count100 += c100;
    }

    public boolean outputCash(int sum) {
        System.out.println("Enter sum = " + sum);
        if (sum < 0) {
            System.out.println("sum can't be negative");
            successful = false;
        } else {
            while (sum > 0) {
                sum = getInformationAboutCountBanknote(sum);
                if (!successful) break;
            }
            if (successful)
                System.out.println("For this sum you need: " + "banknote 20: " + countInSum20 + " banknote 50: " + countInSum50 + " banknote 100: " + countInSum100);
            else System.out.println("Atm doesn't have banknotes for this sum");
            countInSum20 = 0;
            countInSum50 = 0;
            countInSum100 = 0;
        }
        return successful;
    }

    private int getInformationAboutCountBanknote(int sum) {
        if (sum % 10 != 0 || sum < 20)
            successful = false;
        else if (sum / 100 > 0 && count100 >= (sum / 100) && (((sum-(sum/100)*100)%20==0)||((sum-(sum/100-1)*100)%20!=0 && ((sum / 100) > 1))||sum%100>=50)) {
            countInSum100 = sum / 100;
            if( (sum-(sum/100-1)*100)%20!=0&&sum%100<50) countInSum100--;
            sum -= countInSum100 * 100;
            count100 -= countInSum100;
        } else if (sum / 50 > 0 && count50 >= (sum / 50) && ((sum - (sum / 50) * 50) % 20 == 0 || ((sum - ((sum / 50) - 1) * 50) % 20 == 0) && (sum / 50) > 1)) {
            countInSum50 = sum / 50;
            if ((sum - (sum / 50) * 50) % 20 != 0)
                countInSum50--;
            count50 -= countInSum50;
            sum -= countInSum50 * 50;
        } else if (sum / 20 > 0 && count20 >= (sum / 20)) {
            countInSum20 = sum / 20;
            count20 -= countInSum20;
            sum -= countInSum20 * 20;
        }
        else successful=false;
        return sum;
    }

}