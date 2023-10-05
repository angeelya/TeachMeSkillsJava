package work12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Practice 1");
        workWithFileTms();
        System.out.println("Practice 2");
        workWithFileTms2();
        System.out.println("Practice 3");
        serializeAndDeserializeStudent();
    }

    private static void serializeAndDeserializeStudent() {
        Student student = new Student("Julia", "Ivanova", 19);
        String path = "C:\\Users\\Angelina\\OneDrive\\Рабочий стол\\tms\\student.txt";
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            outputStream.writeObject(student);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))) {
            Student studentRestored=(Student)inputStream.readObject();

        } catch (IOException |ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void workWithFileTms2() {
        String path = "C:\\Users\\Angelina\\OneDrive\\Рабочий стол\\tms\\tms2.txt";
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write("Cognosce te ipsum");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader fileReader = new FileReader(path)) {
            char first = (char) fileReader.read();
            System.out.println(first);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void workWithFileTms() {
        String path = "C:\\Users\\Angelina\\OneDrive\\Рабочий стол\\tms\\tms.txt";
        try (FileOutputStream fileOutputStream = new FileOutputStream(path)) {
            byte[] bytes = in.nextLine().getBytes();
            fileOutputStream.write(bytes, 0, bytes.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            String str = new String(fileInputStream.readAllBytes());
            System.out.println(str.replace(' ', '_'));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
