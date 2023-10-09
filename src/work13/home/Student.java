package work13.home;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name, group;
    private int course;
    private Map<String, Integer> grades = new HashMap<>();

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public Double getAverageGrade() {
            if (grades.isEmpty()) return 0.0;
            Integer[] gradesStudent = grades.values().toArray(new Integer[0]);
            Double sum = 0.0;
            for (int i = 0; i < gradesStudent.length; i++) {
                sum += gradesStudent[i];
            }
            return sum / gradesStudent.length;
    }

    public void setGrades(String nameDiscipline, Integer grade) {
        grades.put(nameDiscipline, grade);
    }
}
