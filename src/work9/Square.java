package work9;

public class Square extends Shape{
    @Override
    public String draw() {
        return super.draw()+Square.class.getSimpleName();
    }

    @Override
    public String erase() {
        return super.erase()+Square.class.getSimpleName();
    }
}
