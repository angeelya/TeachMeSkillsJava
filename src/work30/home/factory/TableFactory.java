package work30.home.factory;

public class TableFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}
