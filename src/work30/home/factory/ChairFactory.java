package work30.home.factory;

public class ChairFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}
