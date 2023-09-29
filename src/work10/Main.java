package work10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Practice 1.1");
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

    }

    private static void workWithStringBuffer() {
        StringBuffer stringBuffer =  new StringBuffer("Hello");//task 2.1
        stringBuffer.append("xxxx");//task2.2
        stringBuffer.insert(4,"y");//task 2.3
        stringBuffer.delete(2,5);//task2.4
        stringBuffer.reverse();//task2.5
        String str = String.valueOf(stringBuffer);//task2.6
        System.out.println(str);
    }

    private static void splitString(String str) {
     String[] strMas =str.split(",");
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
