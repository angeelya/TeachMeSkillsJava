package work30.home.proxy;

public class ProxyImage implements Image{
    private ObjectImage objectImage;
    private String name;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if(objectImage==null)
            objectImage= new ObjectImage(name);
        objectImage.display();
    }
}
