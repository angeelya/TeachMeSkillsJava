package work4;

import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    static int count;
    public static void main(String[] args){
     /*System.out.println("Practice 1 ");
     randomFiveNumber();
     System.out.println("Practice 2 ");
     workWithFruits();
     System.out.println("Practice 3 ");
     workWithMasDouble();
     System.out.println("Practice 4 ");
     getAverage();
     System.out.println("Practice 5 ");
     workWith12Array();
     System.out.println("Practice 6 ");
     insertElement();
     System.out.println("Practice 7 ");
     sumPair();
     System.out.println("Practice 8");
     flipArray();
     System.out.println("Practice 9");
     helpTeacherForMultiplicationTable();*/
        Home4 home4=new Home4();
        System.out.println("Task 1 ");
        home4.arrayOutput();
        System.out.println("Task 2 ");
        home4.findMaxMin();
        System.out.println("Task 3 ");
        home4.findMaxMinIndex();
        System.out.println("Task 4 ");
        home4.findCountZero();
        System.out.println("Task 5 ");
        home4.swapElementsInArray();
        System.out.println("Task 6 ");
        home4.checkIsIncreasingSequence();
        System.out.println("Task* ");
        home4.arrayLikeNumber();
    }

    private static void helpTeacherForMultiplicationTable() {
        int [][]mas = new int[15][2];
        for (int i=0; i<mas.length; i++)
        {
            mas=fillPair(i,mas);

            if(i!=0)
            for(int k=0;k<i;k++)
                if((mas[i][0]==mas[k][0]&&mas[i][1]==mas[k][1])||(mas[i][0]==mas[k][1]&&mas[i][1]==mas[k][0]))
                {
                    mas=fillPair(i,mas);
                }
            System.out.println(mas[i][0]+"*"+mas[i][1]+"="+(mas[i][0]*mas[i][1]));
        }



    }

    private static int [][] fillPair(int i, int[][] mas) {
        for(int j=0;j<mas[i].length;j++)
            mas[i][j]=((int)(Math.random()*8+2));
        return mas;
    }


    private static void flipArray() {
        int [] mas = {14,35,46,57,87,9,34,2};
        int t;
        System.out.println("Original array: "+Arrays.toString(mas));

        for(int i=0; i<mas.length/2;i++)
        {
            t = mas[i];
            mas[i]=mas[mas.length-i-1];
            mas[mas.length-i-1]=t;
        }
        System.out.println("Flip array: "+Arrays.toString(mas));
    }

    private static void sumPair() {
        System.out.println("Enter number");
        int enterSum = in.nextInt();
        int [] mas = {14,35,46,5,8,9,34,2};
        boolean notFound=true;
        for(int i=0; i<mas.length-1;i++)
        {
            for(int j=i+1;j<mas.length;j++)
            {
             if(mas[i]+mas[j]==enterSum)
             {
                 System.out.print(mas[i]+"+"+mas[j]+"="+(mas[i]+mas[j]));
                notFound=false;
             }
            }
        }
        if(notFound)
        System.out.println("not found");
    }

    private static void insertElement() {
        int [] mas = {1,3,4,5,8,9,34,2};
        System.out.println("Enter element");
        int element = in.nextInt();
        System.out.println("Enter index of element");
        int index = in.nextInt();
        mas =insertInArray(mas,element,index);
        System.out.println(Arrays.toString(mas));
    }

    private static int[] insertInArray(int[] mas, int element, int index) {
        int[] masInsert = new int[mas.length + 1];
        for (int i = 0; i < mas.length + 1; i++) {
            if (i < index)
                masInsert[i] = mas[i];
            else if (i == index) {
                masInsert[i] = element;
            } else {
                masInsert[i] = mas[i - 1];
            }
        }
        return masInsert;
    }

    private static void workWith12Array() {
        int [] mas = new int[12];

        for(int i=0; i<mas.length;i++)
        {
            mas[i]= -15 + (int) (Math.random()*31);
        }
        System.out.println(Arrays.toString(mas));
        findMax(mas);
    }

    private static void findMax(int [] mas) {
        int t = Integer.MIN_VALUE, s=0;
        for (int i=0; i< mas.length;i++)
        {
            if(mas[i]>t)
            {
                t=mas[i];
                s=i;
            }
        }
        System.out.println("Max element "+t+" Index: "+s);
    }

    private static void getAverage() {
        int [] masInt = {1,2,6,4,3};
        OptionalDouble average = Arrays.stream(masInt).average();
        System.out.println("Average: "+average);
        double sum=0;
        for(int i=0; i< masInt.length;i++)
        {
            sum+=masInt[i];
        }
        System.out.println("Average with FOR"+sum/masInt.length);
    }

    private static void workWithMasDouble() {
        System.out.println("Enter count array elements ");
         if (in.hasNextInt()) {
            count =in.nextInt();
            double[] masDouble = new double[count];

            for (int i = 0; i < count; i++) {
                masDouble[i] = Math.random();
            }
            outArray(masDouble,true);
            for(int i=0; i<masDouble.length;i++)
            {
                if(i%2==0)
                {
                    masDouble[i]= Math.pow(masDouble[i],2);
                }
            }
             outArray(masDouble,true);
             outArray(masDouble,false);
         }
    }

    private static void outArray(double [] masDouble, boolean order) {
      System.out.println(order?Arrays.toString(masDouble): reverseOrderArray(masDouble));
    }

    private static String reverseOrderArray(double [] masDouble) {
        String reverseArray="";
        for(int i=masDouble.length-1;i>=0;i--)
        {
            reverseArray += masDouble[i]+" ";
        }
        return reverseArray;
    }

    private static void workWithFruits() {
        String [] fruits = {"apple","orange","banana","watermelon"};
        System.out.println(fruits[1]+" "+fruits[3]);
        System.out.println("Length "+fruits.length);
        fruits[3]="lemon";
        System.out.println(fruits[3]);
    }

    private static void randomFiveNumber() {
        String random="";
        for (int i=0;i<5;i++)
        {
            random += Math.pow(Math.random(),2)+" ";
        }
        System.out.println(random);
    }
}
