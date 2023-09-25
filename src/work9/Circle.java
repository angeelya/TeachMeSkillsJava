package work9;

public class Circle extends Shape{
    @Override
    public String draw() {
        return super.draw()+Circle.class.getSimpleName();
    }

    @Override
    public String erase() {
        return super.erase()+Circle.class.getSimpleName();
    }
}
