package work9;

public class Triangle extends Shape{
    @Override
    public String draw() {
        return super.draw()+Triangle.class.getSimpleName();
    }

    @Override
    public String erase() {
        return super.erase()+Triangle.class.getSimpleName();
    }
}
