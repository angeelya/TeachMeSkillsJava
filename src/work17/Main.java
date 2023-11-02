package work17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String teachMeSkills = "Today my 17th lesson. I?m the best 1! Find me in inst: @teachmeskills";
    public static void main(String[] args) {
        System.out.println("Practice 1");
        getNumbersFromString();
        System.out.println("Practice 2");
        replaceLetters();
        System.out.println("Practice 3");
        getInst();
        System.out.println("Practice 4");
        isWordNull();
        System.out.println("Practice 5");
        replaceSymbolOfNewLine();
        System.out.println("Practice 6");
        getName();
    }

    private static void getName() {
    String str ="Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        Pattern pattern = Pattern.compile("\\b[А-Я][а-я]* [А-Я][а-я]*\\b",Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(str);
         if(matcher.find()) {
            System.out.println(matcher.group());
    }
         else {
             System.out.println("Name and Lastname aren't found");
         }
    }

    private static void replaceSymbolOfNewLine() {
        String str ="Hello \n world \n !!!";
        Pattern pattern = Pattern.compile("\n");
        str = pattern.matcher(str).replaceAll("");
        System.out.println(str);
    }

    private static void isWordNull() {
        String str="null";
        Pattern pattern = Pattern.compile("^null$");
        System.out.println("Is word null? "+pattern.matcher(str).find());
    }

    private static void getInst() {
        Pattern pattern = Pattern.compile("@(\\w+)");//symbol @ and word which contain letters, digits and _ _
        StringBuilder stringBuilder = new StringBuilder();
        Matcher matcher= pattern.matcher(teachMeSkills);
        if(matcher.find())
           stringBuilder.append(matcher.group());
        System.out.println(stringBuilder);
    }

    private static void replaceLetters() {
        Pattern pattern = Pattern.compile("[A-z]");
        String result  = pattern.matcher(teachMeSkills).replaceAll("&");
        System.out.println(result);
    }

    private static void getNumbersFromString() {

        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(teachMeSkills);
        while(matcher.find())
        {
           stringBuilder.append(matcher.group());
        }
        System.out.println(stringBuilder);
    }
}
