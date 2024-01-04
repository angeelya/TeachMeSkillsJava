package work31.home.adapter;

public abstract class Charger {
    private boolean quickSpeed;

    public Charger(boolean quickSpeed) {
        this.quickSpeed = quickSpeed;
    }

    public boolean isQuickSpeed() {
        return quickSpeed;
    }
}
