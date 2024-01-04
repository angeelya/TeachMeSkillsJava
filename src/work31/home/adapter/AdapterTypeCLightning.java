package work31.home.adapter;

public class AdapterTypeCLightning extends Lightning{
   private TypeC typeC;

    public AdapterTypeCLightning(TypeC typeC) {
        super(typeC.isQuickSpeed());
        this.typeC = typeC;
    }

}
