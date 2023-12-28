package work30.home.factory;

public class SofaFactory implements FurnitureFactory{

    @Override
    public Furniture createFurniture() {
        return new Sofa();
    }
}
