package work20.home;

import work20.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static String DATABASE_NAME = "work20", LOGIN = "root", PASS = "mysql";

    public static void main(String[] args) {
        System.out.println("Task 1");
        crud();
    }

    private static void crud() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE_NAME, LOGIN, PASS);
            Statement statement = connection.createStatement();
            List<Staff> persons = new ArrayList<>(Arrays.asList(new Staff(1L, "Alisa", 21, "clerk")
                    , new Staff(2L, "Alexandr", 45, "director")));
            createStaff(statement);
            insertStaff(statement, persons);
            updateAgeStaff(statement, 22, 1l);
            selectALL(statement);
            deleteById(statement, 3l);
            selectALL(statement);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                 SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void deleteById(Statement statement, Long id) throws SQLException {
        if (statement.executeUpdate("delete from staff where id=" + id.toString()) > 0)
            System.out.println("Delete is successful");
        else System.out.println("Delete isn't successful");
    }

    private static void selectALL(Statement statement) throws SQLException {
        ResultSet staff = statement.executeQuery("select * from staff");
        List<Staff> staffList = new ArrayList<>();
        while (staff.next()) {
            Staff staffPerson = new Staff();
            staffPerson.setId(staff.getLong("id"));
            staffPerson.setName(staff.getString("name"));
            staffPerson.setAge(staff.getInt("age"));
            staffPerson.setPost(staff.getString("post"));
            staffList.add(staffPerson);
        }
        System.out.println(staffList);
    }

    private static void updateAgeStaff(Statement statement, Integer age, Long id) throws SQLException {
        if (statement.executeUpdate("update staff set age=" + age.toString() + " where id=" + id.toString()) > 0)
            System.out.println("Update is successful");
        else System.out.println("Update isn't successful");
    }

    private static void insertStaff(Statement statement, List<Staff> persons) throws SQLException {
        for (int i = 0; i < persons.size(); i++) {
            Staff person = persons.get(i);
            if (statement.executeUpdate("insert into staff(name,age,post) value('" + person.getName() + "'," + person.getAge().toString() + ",'" + person.getPost() + "')") > 0)
                System.out.println("Insert is successful");
            else System.out.println("Insert isn't successful");
        }
    }

    private static void createStaff(Statement statement) throws SQLException {
        statement.executeUpdate("create table IF NOT EXISTS staff (id bigint primary key auto_increment ,name varchar(200), age int, post varchar(200))");
    }
}
