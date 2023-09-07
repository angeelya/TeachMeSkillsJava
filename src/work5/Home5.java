package work5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Home5 {
    Scanner in = new Scanner(System.in);
    int enterNumber;

    public void createDoubleArray()//task1
    {
        Random random = new Random();//task1.1
        int[][] mas = new int[10][5];
        for (int i = 0; i < mas.length; i++)
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(20);
            }
        System.out.println("Initial array: " + Arrays.deepToString(mas));
        System.out.println("Enter number");//task1.2
        if (in.hasNextInt())
            enterNumber = in.nextInt();
        else System.out.println("It isn't integer");
        int sum = 0;
        for (int i = 0; i < mas.length; i++)
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] += enterNumber;
                sum += mas[i][j];//task1.3
            }
        System.out.println("array + enter number: " + Arrays.deepToString(mas));
        System.out.println("sum elements: " + sum);
    }

    public void chessBoard()//task2
    {
        String[][] mas = new String[8][8];
        for (int i = 0; i < mas.length; i++)
            for (int j = 0; j < mas[i].length; j++) {
                if (j % 2 == 0 && i % 2 == 0 || j % 2 != 0 && i % 2 != 0)
                    mas[i][j] = "W";
                else mas[i][j] = "B";
            }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void snakeOfNumbers()//task*
    {
        int n, m;
        System.out.println("Enter n");
        if (in.hasNextInt())
            n = in.nextInt();
        else {
            System.out.println("It isn't integer");
            return;
        }
        System.out.println("Enter m");
        if (in.hasNextInt())
            m = in.nextInt();
        else {
            System.out.println("It isn't integer");
            return;
        }
        int[][] mas = new int[n][m];
        int num = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i % 2 == 0)
                    mas[i][j] = num;
                else mas[i][mas[i].length - j - 1] = num;
                num++;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(String.format("%3d", mas[i][j]));
            }
            System.out.print("\n");
        }
    }
}
