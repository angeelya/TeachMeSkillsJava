package work2;

public class TaskStar {
    int a=1, b=2;
    public String change()
    {   a=a^b^(b=a);
        return "a= "+a+" b= "+ b;
    }
}
