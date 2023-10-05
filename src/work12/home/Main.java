package work12.home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static String path;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task1");
        getMaxWord();
        System.out.println("Task*");
        checkDocument();
    }

    private static void checkDocument() {
        System.out.println("Enter path");
        String pathStr = in.nextLine(), line;
        Path path = Paths.get(pathStr);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
            while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
                isValid(line);
            }
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void isValid(String line) {
        boolean notValid = false;
        String result = "", path;

        if (line.startsWith("docnum")||line.startsWith("contract")) {
            if (!line.matches("^[a-zA-Z\\d]+$")) {
                notValid = true;
                result = line + " It contains no only letters and numbers.";
            }
            if (line.length() != 15) {
                if (notValid) {
                    result += " Length isn't 15";
                } else {
                    result = line + " Length isn't 15";
                    notValid = true;
                }
            }
        }
        else { if (notValid) {
            result += " String don't start with docnum or contract";
        } else {
            result = line + " String don't start with docnum or contract";
            notValid = true;
        }}
        if (notValid)
            path = "C:\\Users\\Angelina\\OneDrive\\Рабочий стол\\tms\\work4\\src\\work12\\home\\isNotValidDocument.txt";
        else { result=line;
            path = "C:\\Users\\Angelina\\OneDrive\\Рабочий стол\\tms\\work4\\src\\work12\\home\\isValidDocument.txt";
        }
            try (FileWriter fileWriter = new FileWriter(path,true)) {
            fileWriter.write(result+"\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void getMaxWord() {
        ArrayList<String> lines = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Angelina\\OneDrive\\Рабочий стол\\tms\\work4\\src\\work12\\home\\RomeoAndJuliet.txt"))) {
            while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\Angelina\\OneDrive\\Рабочий стол\\tms\\work4\\src\\work12\\home\\maxLengthWord.txt")){
           fileWriter.write(getMaxLengthOfWord(lines));
            System.out.println("Max length: " + getMaxLengthOfWord(lines));
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static String getMaxLengthOfWord(ArrayList<String> lines) {
        String[] maxWords = new String[lines.size()], words;
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        for (int i = 0; i < lines.size(); i++) {
            words = lines.get(i).split(" ");
            Arrays.sort(words, comparator);
            maxWords[i] = words[words.length - 1];
        }
        Arrays.sort(maxWords, comparator);
        return maxWords[maxWords.length - 1];
    }
}