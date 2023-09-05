package work4;

import java.util.Arrays;
import java.util.Scanner;

public class Home4 {
    Scanner in = new Scanner(System.in);
    int countElements;

    public int[] initArray() {
        System.out.println("Enter count of elements");
        if (in.hasNextInt())
            countElements = in.nextInt();
        else System.out.println("It isn't count of element");
        int[] mas = new int[countElements];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20);
        }
//        enterUserArray(mas);
        return mas;
    }

    private void enterUserArray(int[] mas) {

        for (int i = 0; i < mas.length; i++) {
            System.out.println("Enter element" + i + ":");
            try {
                mas[i] = in.nextInt();
            } catch (Exception e) {
                System.out.println("It isn't integer");
                break;
            }
        }
    }

    public void arrayOutput()//task1
    {
        int[] mas = initArray();
        System.out.print("Direct output: ");
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.print("\nReverse output: ");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
    }

    public void findMaxMin()//task2
    {
        int[] mas = initArray();
        int max = Integer.MIN_VALUE, min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            } else if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("Array =" + Arrays.toString(mas) + " " + "Min=" + min + " " + "Max=" + max);
    }

    public void findMaxMinIndex()//task3
    {
        int[] mas = initArray();
        int max = Integer.MIN_VALUE, min = mas[0], indexMin = 0, indexMax = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                indexMax = i;
            } else if (mas[i] < min) {
                min = mas[i];
                indexMin = i;
            }
        }
        System.out.println("Array =" + Arrays.toString(mas) + " " + "MinIndex=" + indexMin + " " + "MaxIndex=" + indexMax);
    }

    public void findCountZero()//task4
    {
        int[] mas = initArray();
        int countZero = 0;
        boolean notFound = true;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                countZero++;
                notFound = false;
            }
        }
        System.out.println(notFound ? "Array:" + Arrays.toString(mas) + " zero not found" : "Array:" + Arrays.toString(mas) + " Count zero: " + countZero);
    }

    public void swapElementsInArray()//task5
    {
        int[] mas = initArray();
        int a;
        System.out.println("initial array: " + Arrays.toString(mas));
        for (int i = 0; i < mas.length / 2; i++) {
            a = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = a;
        }
        System.out.println("modified array: " + Arrays.toString(mas));
    }

    public void checkIsIncreasingSequence()//task6
    {
        int[] mas = initArray();
        boolean increasingSequence = false;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i + 1] > mas[i]) increasingSequence = true;
            else {
                increasingSequence = false;
                break;
            }
        }
        System.out.println(increasingSequence ? "Array: "+Arrays.toString(mas)+"This is increasing sequence" : "Array: "+Arrays.toString(mas)+"This isn't increasing sequence");
    }

    public void arrayLikeNumber()//task*
    {
        System.out.println("Enter count of elements");
        if (in.hasNextInt())
            countElements = in.nextInt();
        else System.out.println("It isn't count of element");
        int[] mas = new int[countElements];
        int element;
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Enter element" + i + ":");
            try {
                element = in.nextInt();
                if ((element > 0 && element / 10 < 1) || (element == 0 && i != 0) || (element == 0 && mas.length == 1))
                    mas[i] = element;
                else
                    System.out.println("It isn't positive integer, 0 or 0 is first element and count array >1 or element >9");
            } catch (Exception e) {
                System.out.println("It isn't integer");
                break;
            }
        }
        System.out.println("Initial array: " + Arrays.toString(mas));
        for (int i = mas.length - 1; i >= 0; i--) {
            if (mas[i] != 9) {
                mas[i]++;
                break;
            } else if (mas[i] == 9 && i == 0) mas = insertZero(mas);
            else mas[i] = 0;
        }
        System.out.println("Modified array: " + Arrays.toString(mas));
    }

    private int[] insertZero(int[] mas) {
        int[] modifiedMas = new int[mas.length + 1];
        System.arraycopy(mas, 0, modifiedMas, 0, modifiedMas.length - 1);
        modifiedMas[modifiedMas.length - 1] = 0;
        modifiedMas[0] = 1;
        return modifiedMas;
    }
}