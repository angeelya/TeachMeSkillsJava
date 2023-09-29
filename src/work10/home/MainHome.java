package work10.home;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MainHome {
    static Scanner in = new Scanner(System.in);
    static String[] str = new String[3];
    static String enterString;
    static int enterNumberWord;

    public static void main(String[] args) {
        System.out.println("Enter string 1");
        str[0] = in.nextLine();
        System.out.println("Enter string 2");
        str[1] = in.nextLine();
        System.out.println("Enter string 3");
        str[2] = in.nextLine();
        System.out.println("Task1");
        findLengthString();
        System.out.println("Task2");
        increasingSequenceLength();
        System.out.println("Task3");
        findLengthLessThanAverageLengthString();
        System.out.println("Task4");
        findWordFromDifferentSymbol();
        System.out.println("Task5");
        duplicateSymbol("Hello");
        System.out.println("Task*");
        getPalindrome();
    }

    private static void getPalindrome() {//task*
        System.out.println("Enter string");
        enterString = in.nextLine();
        System.out.println("Enter the number of the word that you want to check for palindrome");
        if(in.hasNextInt())
        {
            enterNumberWord = in.nextInt();
            String [] arrayWords = enterString.split(" ");
            if(enterNumberWord<=arrayWords.length&&enterNumberWord>-1)
            {
                findPalindrome(arrayWords);
            }
            else {
                System.out.println("Number exits the word count range");
            }
        }
        else System.out.println("This isn't integer");
    }

    private static void findPalindrome(String[] arrayWords) {
        StringBuffer word = new StringBuffer(arrayWords[enterNumberWord-1]);
        if(arrayWords[enterNumberWord-1].equalsIgnoreCase(String.valueOf(word.reverse())))
            System.out.println(arrayWords[enterNumberWord-1]+" is palindrome");
        else System.out.println(arrayWords[enterNumberWord-1]+" isn't palindrome");
    }

    private static void duplicateSymbol(String str) {//task5
        StringBuffer stringBuffer = new StringBuffer();
        char nowChar;
        for (int i = 0; i < str.length(); i++) {
            nowChar = str.charAt(i);
            stringBuffer.append(nowChar).append(nowChar);
        }
        System.out.println(stringBuffer);
    }

    private static void findWordFromDifferentSymbol() {//task4
        boolean isWordSFromDifferentSymbol = false;
        for (int i = 0; i < str.length; i++) {
            if (compareSymbol(str[i])) {
                System.out.println("Word made from various symbols: " + str[i]);
                isWordSFromDifferentSymbol = true;
                break;
            }

        }
        if (!isWordSFromDifferentSymbol) System.out.println("there is no such");
    }

    private static boolean compareSymbol(String mas) {
        for (int i = 0; i < mas.length() - 1; i++) {
            for (int j = i + 1; j < mas.length(); j++) {
                if (mas.charAt(i) == mas.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void findLengthLessThanAverageLengthString() {//task3
        double average = average(str);
        System.out.println(average);
        boolean isLessThanAverage = false;
        for (int i = 0; i < str.length; i++) {
            if (Double.valueOf(str[i].length()) < average) {
                System.out.println("String: " + str[i] + " length: " + str[i].length());
                isLessThanAverage = true;
            }

        }
        if (!isLessThanAverage) System.out.println("there is no such");
    }

    private static double average(String[] str) {
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += str[i].length();
        }
        return sum / Double.valueOf(str.length);
    }

    private static void increasingSequenceLength() {//task2
        Comparator<String> stringComparator = Comparator.comparingInt(String::length);
        Arrays.sort(str, stringComparator);
        System.out.println(Arrays.toString(str));
       /* String st;
        for(int i =0; i< str.length-1;i++)
        {  for(int j=i+1; j< str.length;j++)
            if(str[i].length()> str[j].length())
            {
             st=str[i];
             str[i]=str[j];
             str[j]=st;
            }
        }
        System.out.println(Arrays.toString(str));*/
    }

    private static void findLengthString() {//task1
        int max = Integer.MIN_VALUE, min = str[0].length(), indexMax = 0, indexMin = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max) {
                max = str[i].length();
                indexMax = i;
            } else if (str[i].length() < min) {
                min = str[i].length();
                indexMin = i;
            }
        }
        System.out.println("Max length: " + str[indexMax] + " length: " + str[indexMax].length() + "\nMin length: " + str[indexMin] + " length: " + str[indexMin].length());
    }
}
