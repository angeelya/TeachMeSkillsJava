package work31.home.adapter;

public class PhoneWithTypeC implements Phone {
    @Override
    public void fits(Charger unknownCharge) {
        if (unknownCharge instanceof TypeC && unknownCharge.isQuickSpeed()) {
            System.out.println("Charging in progress. It is quick charger");
        } else if (unknownCharge instanceof TypeC && !unknownCharge.isQuickSpeed()) {
            System.out.println("Charging in progress");
        } else System.out.println("Charger doesn't fit");
    }
}
