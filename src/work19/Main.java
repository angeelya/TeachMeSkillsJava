package work19;

import work8.home.task1.Therapist;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice1-2");
        workWithThread();
        System.out.println("Practice3");
        workWithInterfaceRunnable();
        System.out.println("Practice4");
        counter();
    }

    private static void counter() {
        Thread[] threads = new Thread[5];
        for(int i=0; i<threads.length;i++)
        {
            threads[i]=new Thread(new CounterThread(new Counter()));
        }
        try {
            for (Thread thread : threads) {
                thread.start();
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static void workWithInterfaceRunnable() {
        RunnableExample runnableExample = new RunnableExample();
        Thread thread = new Thread(runnableExample);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void workWithThread() {
        Child child = new Child();
        try {
            child.start();
            child.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток завершает работу");

    }

}
