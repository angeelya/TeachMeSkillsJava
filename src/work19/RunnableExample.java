package work19;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<101;i++) System.out.println(i);
    }
}
