package work5;

import java.util.Arrays;
import java.util.Random;


public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
       /* System.out.println("Practice 1.1");
        workWithDoubleArray();
        System.out.println("Practice 1.2");
        maxInDoubleArray();
        System.out.println("Practice 2");
        workWithNonRectangularArray();
        System.out.println("Practice 3");
        sumDiagonal();
        System.out.println("Practice 4");
        workWithMatrix();
        System.out.println("Practice 5");
        arrayFromSymbol();*/
        Home5 home5 = new Home5();
        System.out.println("Task 1");
        home5.createDoubleArray();
        System.out.println("Task2 ");
        home5.chessBoard();
        System.out.println("Task* ");
        home5.snakeOfNumbers();
    }

    private static void arrayFromSymbol() {
        char[] mas = new char[11];
        mas[0] = ' ';
        mas[1] = 'r';
        mas[2] = ' ';
        mas[3] = '3';
        mas[4]=' ';
        int countElements = 0;
        for (char c : mas) {
            if (c == ' ')
                countElements++;
        }
        int newLength = mas.length - countElements * 2 - 1;
        for (int i = mas.length - 1, j = newLength; j >= 0; j--) {
            if (mas[j] == ' ') {
                mas[i--] = '0';
                mas[i--] = '2';
                mas[i--] = '%';
            } else mas[i--] = mas[j];
        }
        System.out.println(Arrays.toString(mas));
    }

    private static void workWithMatrix() {
        int[][] mas1 = new int[3][4];
        int[][] mas2 = new int[3][3];
        int sum = 0;
        for (int i = 0; i < mas1.length; i++) {
            for (int j = mas1[i].length - 1; j >= 0; j--) {
                sum++;
                mas1[i][j] = sum;
            }
        }
        System.out.println(Arrays.deepToString(mas1));
        sum = 0;
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1.length; j++) {
                sum++;
                mas2[j][i] = sum;
            }
        }
        System.out.println(Arrays.deepToString(mas2));
    }

    private static void sumDiagonal() {
        int[][] mas = new int[5][5];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(20);
            }
        }
        System.out.println(Arrays.deepToString(mas));
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i][i];
        }
        System.out.println("Sum diagonal: " + sum);
    }

    private static void workWithNonRectangularArray() {
        int[][][] mas = new int[6][2][];
        mas[0][0] = new int[2];
        mas[0][1] = new int[2];
        mas[1][0] = new int[1];
        mas[1][1] = new int[1];
        mas[2][0] = new int[4];
        mas[2][1] = new int[4];
        mas[3][0] = new int[3];
        mas[3][1] = new int[3];
        mas[4][0] = new int[4];
        mas[4][1] = new int[4];
        mas[5][0] = new int[4];
        mas[5][1] = new int[4];

        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < mas[i][j].length; k++)
                    count++;
            }
        }
        System.out.println("Count element: " + count);
    }

    private static void maxInDoubleArray() {
        int[][] mas = workWithDoubleArray();
        int t = Integer.MIN_VALUE;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > t) {
                    t = mas[i][j];
                }
            }
        }
        System.out.println("max= " + t);
    }

    private static int[][] workWithDoubleArray() {
        int[][] mas = new int[6][2];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(20);
            }
        }
        System.out.println(Arrays.deepToString(mas));
        return mas;
    }
}
