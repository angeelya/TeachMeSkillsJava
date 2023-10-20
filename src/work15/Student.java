package work15;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<String> disciplines= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDisciplines() {
        return disciplines;
    }

    public void setDiscipline(String discipline) {
        disciplines.add(discipline);
    }
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", disciplines=" + disciplines +
//                '}';
//    }

    public Student(String name, List<String> disciplines) {
        this.name = name;
        this.disciplines = disciplines;
    }
}
