package work31.home.adapter;

public class PhoneWithLightning implements Phone {
    @Override
    public void fits(Charger unknownCharge) {
        if (unknownCharge instanceof Lightning && unknownCharge.isQuickSpeed()) {
            System.out.println("Charging in progress. It is quick charger");
        } else if (unknownCharge instanceof Lightning && !unknownCharge.isQuickSpeed()) {
            System.out.println("Charging in progress");
        } else System.out.println("Charger doesn't fit");
    }
}
