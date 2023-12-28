package work30;

import work30.AbstractFactory.*;
import work30.Builder.DeveloperObject;
import work30.Factory.Developer;
import work30.Factory.JSDevFactory;
import work30.Factory.JavaDevFactory;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static String language;

    public static void main(String[] args) {
        System.out.println("Practice 1");
        Sun sun1 = Sun.getInstance(), sun2 = Sun.getInstance();
        System.out.println(sun1 + "=" + sun2);
        System.out.println("Practice 2");
        getDevelopers();
        System.out.println("Practice 3");
        getCourses();
        System.out.println("Practice 4");
        createDeveloper();
    }

    private static void createDeveloper() {
        DeveloperObject developer = new DeveloperObject.DeveloperBuilder().
                name("Alex").
                age(26).
                language("Java").
                build();
        System.out.println(developer);
    }

    private static void getDevelopers() {
        JavaDevFactory javaDevFactory = new JavaDevFactory();
        JSDevFactory jsDevFactory = new JSDevFactory();
        Developer javaDev = javaDevFactory.createDev(), jsDev = jsDevFactory.createDev();
        javaDev.develop();
        jsDev.develop();
    }

    private static void getCourses() {
        language = in.nextLine();
        if (language.equalsIgnoreCase("Java")) {
            JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
            Teacher teacherJava = javaCourseFactory.createTeacher();
            Language languageJava = javaCourseFactory.createLanguage();
            LessonsProgram lessonsProgramJava = javaCourseFactory.createLessonsProgram();
            teacherJava.teach();
            languageJava.getName();
            lessonsProgramJava.countLessons();
        } else if (language.equalsIgnoreCase("C#")) {
            CSharpCourseFactory cSharpCourseFactory = new CSharpCourseFactory();
            Teacher teacherCSharp = cSharpCourseFactory.createTeacher();
            Language languageCSharp = cSharpCourseFactory.createLanguage();
            LessonsProgram lessonsProgramCSharp = cSharpCourseFactory.createLessonsProgram();
            teacherCSharp.teach();
            languageCSharp.getName();
            lessonsProgramCSharp.countLessons();
        }
    }
}
