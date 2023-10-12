package work13.home;

import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task1");
        getRidOfDuplicateElements();
        System.out.println("Task2");
        workWithClassAnimal();
        System.out.println("Task3");
        workWithStudent();
        System.out.println("Task*");
        workWithMyCollection();
    }

    private static void workWithMyCollection() {//task*
        ArrayCollection<String> stringArrayCollection = new ArrayCollection<>();
        System.out.println("Collection length: "+stringArrayCollection.length());
        stringArrayCollection.add("hello");
        stringArrayCollection.add("world");
        stringArrayCollection.add("java");
        stringArrayCollection.add("home");
        stringArrayCollection.add("love");
        System.out.println(stringArrayCollection);
        stringArrayCollection.add("queen");
        System.out.println("Collection length: "+stringArrayCollection.length());
        System.out.println(stringArrayCollection);

        stringArrayCollection.remove(0);
        stringArrayCollection.remove("world");
        System.out.println(stringArrayCollection);
        System.out.println(stringArrayCollection.get(0));

        System.out.println("Does java contain?"+stringArrayCollection.contains("java"));

        stringArrayCollection.clear();
        System.out.println(stringArrayCollection);

        ArrayCollection<Integer> integerArrayCollection = new ArrayCollection<>(12);
        integerArrayCollection.add(12);
        System.out.println(integerArrayCollection);
    }

    private static void workWithStudent() {//task3
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "020601", 1));
        students.add(new Student("Vasilii", "050601", 1));
        students.add(new Student("Alisa", "555454", 1));
        students.get(0).setGrades("English",5);
        students.get(0).setGrades("Math",9);
        removeStudentsWhoseGradesBelow3(students);
        printStudent(students, 1);
    }

    private static void printStudent(List<Student> students, int course) {
        System.out.println("Students are in course "+course+":");
        students.forEach(student -> {
            if (student.getCourse() == course)
                System.out.println(student.getName());
        });
    }

    private static void removeStudentsWhoseGradesBelow3(List<Student> students) {

       for(int i=0; i<students.size();i++) {
            if (students.get(i).getAverageGrade() < 3.0&& students.get(i).getAverageGrade()!=0.0) {
                System.out.println(students.get(i).getName()+"delete because grade below 3");
                students.remove(i);
            } else if(students.get(i).getAverageGrade()>=3.0) {
                System.out.println(students.get(i).getName()+" move to the next course because grade higher 3");
                students.get(i).setCourse(students.get(i).getCourse() + 1);
            }
            else {
                System.out.println(students.get(i).getName()+" don't have grades");
            }
        }
    }

    private static void workWithClassAnimal() {//task2
        Animal animal = new Animal();
        animal.setAnimal("wolf");
        animal.setAnimal("tiger");
        animal.setAnimal("rabbit");
        animal.printAnimals();
        animal.deleteLastAnimal();
        animal.printAnimals();
    }

    private static void getRidOfDuplicateElements() {//task1
        System.out.println("Enter numbers through space");
        String[] numbersMas = in.nextLine().split(" ");
        HashSet<String> numbers = new HashSet<>();
        for (int i = 0; i < numbersMas.length; i++) {
            numbers.add(numbersMas[i]);
        }
        System.out.println(numbers);
    }
}
