package work7.home.taskStar;

public class WorkWithCloneable implements Cloneable{
    public String text="Hello";
    @Override
    public WorkWithCloneable clone() throws CloneNotSupportedException {
        return (WorkWithCloneable) super.clone();
    }
}
