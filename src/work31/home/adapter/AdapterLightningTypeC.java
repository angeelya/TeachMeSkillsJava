package work31.home.adapter;

public class AdapterLightningTypeC extends TypeC{
    private Lightning lightning;

    public AdapterLightningTypeC(Lightning lightning) {
        super(lightning.isQuickSpeed());
        this.lightning = lightning;
    }
}
