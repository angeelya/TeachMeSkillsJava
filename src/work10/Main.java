package work10;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static Scanner in = new Scanner(System.in);
    static String chairs;

    public static void main(String[] args) {

      /*  System.out.println("Practice 1.1");
        joinString();

        System.out.println("Practice 1.2");
        equalsString();

        System.out.println("Practice 1.3");
        getSubString();

        System.out.println("Practice 1.4");
        System.out.println("Length string: " + "Hello".length());

        System.out.println("Practice 1.5");
        System.out.println("Index: " + "Cat".indexOf("a"));

        System.out.println("Practice 1.6");
        booleanToString();

        System.out.println("Practice 1.7");
        System.out.println("home".toUpperCase());

        System.out.println("Practice 1.8");
        System.out.println("Lesson 1".replace("1", "%"));

        System.out.println("Practice 1.9");
        System.out.println("  Home  ".trim());

        System.out.println("Practice 1.10");
        isEmptyString("");

        System.out.println("Practice 1.11");
        splitString("Cat, dog, tiger, rabbit");

        System.out.println("Practice 2");
        workWithStringBuffer();
        System.out.println("Practice 3");
        findWordCount();
        System.out.println("Practice 4");
        findMinlengthWord();
        System.out.println("Practice 5");
        findPalindrome();*/
        System.out.println("Practice 6");
        getGivenWordFromSymbolsOfOtherWords();
    }

    private static void getGivenWordFromSymbolsOfOtherWords() {
   //     System.out.println("Enter words");
       String [] words = {"cat","bt","hat","tree"};
        // in.nextLine().split(" ");
       // System.out.println("Enter word");
        StringBuilder stringBuilder = new StringBuilder();
        chairs = "attach";
                //in.nextLine();
        for (int i = 0; i < words.length; i++) {
            if (compareWordsAndChairs(words[i])) {
                stringBuilder.append(words[i]);
            }
        }
        System.out.println(stringBuilder);

    }

    private static boolean compareWordsAndChairs(String word) {
        StringBuilder builderWord = new StringBuilder(word), builderChairs = new StringBuilder(chairs);
        for (int i = 0; i < builderWord.length(); i++) {
            for (int j = 0; j < builderChairs.length(); j++) {
                if (builderWord.charAt(i) == builderChairs.charAt(j)) {
                    builderWord.deleteCharAt(i);
                   if(i!=0) i--;
                    builderChairs.deleteCharAt(j);
                }

            }
        }
        if (builderWord.isEmpty()) {
            chairs = builderChairs.toString();
            return true;
        } else return false;
    }

    private static void findPalindrome() {
        String[] str = in.nextLine().split(" ");
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < str.length; i++) {
            if (isPalindrome(str[i]) && i != str.length - 1)
                stringBuilder.append(str[i]).append(", ");
            else if (isPalindrome(str[i])) stringBuilder.append(str[i]);


        }
        System.out.println("Palindromes: " + stringBuilder);
    }

    private static boolean isPalindrome(String word) {
        StringBuilder wordReverse = new StringBuilder(word);
        if (word.equalsIgnoreCase(String.valueOf(wordReverse.reverse())) && word.length() > 1)
            return true;
        else return false;
    }

    private static void findMinlengthWord() {
        String[] str = in.nextLine().split(" ");
        int min = str[0].length(), indexMin = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < min) {
                min = str[i].length();
                indexMin = i;
            }
        }
        System.out.println("Min word: " + str[indexMin]);
    }

    private static void findWordCount() {
        System.out.println("Enter string");
        String[] str = in.nextLine().split(" ");
        System.out.println("Count word: " + str.length);
    }

    private static void workWithStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer("Hello");//task 2.1
        stringBuffer.append("xxxx");//task2.2
        stringBuffer.insert(4, "y");//task 2.3
        stringBuffer.delete(2, 5);//task2.4
        stringBuffer.reverse();//task2.5
        String str = String.valueOf(stringBuffer);//task2.6
        System.out.println(str);
    }

    private static void splitString(String str) {
        String[] strMas = str.split(",");
        System.out.println(Arrays.toString(strMas));
    }

    private static void isEmptyString(String s) {
        if (s.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("String isn't empty");
        }
    }

    private static void booleanToString() {
        boolean bool = true;
        String boolStr = String.valueOf(bool);
        System.out.println(boolStr);
    }

    private static void getSubString() {
        System.out.println("It is beautiful".substring(3));
    }

    private static void equalsString() {
        String str1 = "Meat", str2 = "meat";

        if (str1.equals(str2)) System.out.println("Case sensitive: " + str1 + "=" + str2);
        else if (str1.equalsIgnoreCase(str2)) System.out.println("ignore case: " + str1 + "=" + str2);
        else {
            System.out.println("Strings aren't equal " + str1 + "!=" + str2);
        }
    }

    private static void joinString() {
        String str1 = "Hello";
        String str2 = ", world";
        System.out.println(str1 + str2);//var1
        System.out.println(str1.concat(str2));//var2
    }
}
