package work19.home;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task 1-2");
        setArray();
        System.out.println("Task*");
        shopping();
    }

    private static void shopping() {//task*
        Shop shop = new Shop();
        Producer producer = new Producer(shop);
        Buyer buyer = new Buyer(shop);
        Thread producerThread = new Thread(producer), buyerThread= new Thread(buyer);
        producerThread.start(); buyerThread.start();
        try {
            producerThread.join();
            buyerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static void setArray() {
        Integer[] numbers;
        int size;
        System.out.println("Enter size array");
        if (in.hasNext()) {
            size = in.nextInt();
            if (size > 1) {
                numbers = setArray(size);
                minMax(numbers);//task1
                sortArray(numbers);//task2
            } else System.out.println("It isn't array length");
        } else {
            System.out.println("It isn't integer");
        }
    }

    private static void sortArray(Integer[] numbers) {
        InsertSort insertSort = new InsertSort(numbers);
        SelectSort selectSort = new SelectSort(numbers);
        BubbleSort bubbleSort = new BubbleSort(numbers);
        Thread threadInsert = new Thread(insertSort), threadSelect = new Thread(selectSort),
                threadBubble = new Thread(bubbleSort);
      threadInsert.start();threadBubble.start();threadSelect.start();
        try {
            threadBubble.join();
            threadInsert.join();
            threadSelect.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Insert sort: "+insertSort.getNumbers()+"\nSelect sort: "+selectSort.getNumbers()+"\nBubble sort: "+bubbleSort.getNumbers());
    }

    private static void minMax(Integer[] numbers) {
        Min min = new Min(numbers);
        Max max = new Max(numbers);
        Thread minThread = new Thread(min), maxThread = new Thread(max);
        minThread.start();
        maxThread.start();
        try {
            minThread.join();
            maxThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Max element: " + max.getMax() + "\nMin element: " + min.getMin());

    }

    private static Integer[] setArray(int size) {
        Integer[] numbers = new Integer[size];
        System.out.println("Enter number, example 1 3 4 5 ");
        for (int i = 0; i < numbers.length; i++) {
            if (in.hasNext())
                numbers[i] = in.nextInt();
            else {
                System.out.println("It isn't integer");
                if (i > 0) i--;
            }
        }
        return numbers;
    }
}
