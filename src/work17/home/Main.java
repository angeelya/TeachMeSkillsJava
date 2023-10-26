package work17.home;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task1");
        getAbbreviation();
        System.out.println("Task*");
        findEmailNumberPhoneNumberDocument();
    }

    private static void findEmailNumberPhoneNumberDocument() {//task*
        String maybeInformation;
        ArrayList<String> number, numDoc, email;
        System.out.println("Enter line");
        maybeInformation = in.nextLine();
        //Test information
//        maybeInformation = "567ivanov@mail.ru  5678-9999-88 +(45)4567890 n.angelina@gmail.com hfgjhhgfj 2345-5677-89 5565-6-65-656 teachmeskills@gmail.com";
        Pattern patternNumberDocument = Pattern.compile("\\d{4}-\\d{4}-\\d{2}"),
                patternEmail = Pattern.compile("[\\w-._%+-]+@[A-z\\d-]+.[a-z]{2,9}"),
                patternNumberPhone = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Matcher matcherDocument = patternNumberDocument.matcher(maybeInformation),
                matcherNumber = patternNumberPhone.matcher(maybeInformation),
                matcherEmail = patternEmail.matcher(maybeInformation);
        numDoc = getValuesArray(matcherDocument, "document number: ");
        number = getValuesArray(matcherNumber, "number: ");
        email = getValuesArray(matcherEmail, "email: ");
        System.out.println(getCardInformation(number, email, numDoc));

    }

    private static String getCardInformation(ArrayList<String> number, ArrayList<String> email, ArrayList<String> numDoc) {
        int i = 0;
        String result = "";
        while (true) {
            if (i < email.size()) {
                result += email.get(i) + "\n";
            }
            if (i < numDoc.size()) {
                result += numDoc.get(i) + "\n";
            }
            if (i < number.size()) {
                result += number.get(i) + "\n";
            }
            if (email.size() - i < 1 && number.size() - i < 1 && numDoc.size() - i < 1) break;
            i++;
            result += "\n";
        }
        return result;
    }

    private static ArrayList<String> getValuesArray(Matcher matcher, String s) {
        ArrayList<String> valuesArray = new ArrayList<>();
        while (matcher.find()) {
            valuesArray.add(s + matcher.group());
        }
        return valuesArray;
    }

    private static void getAbbreviation() {//task1
        System.out.println("Enter line");
        String str = in.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-ZÀ-ß]{2,6}\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
