package work20;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1-2");
        workWithJDBC();
    }

    private static void workWithJDBC() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/work20", "root", "mysql");
            Statement statement = connection.createStatement();
            ResultSet userRes = statement.executeQuery("select * from users where id=1");//practice 1
            User user = new User();
            if (userRes.next()) {
                user.setId(userRes.getLong("id"));
                user.setName(userRes.getString("name"));
                user.setAge(userRes.getInt("age"));
            }
            System.out.println(user);
            ResultSet averageAge = statement.executeQuery("select avg(age)as average from users");
            if (averageAge.next())//practice 2
                System.out.println("Average age: " + averageAge.getDouble("average"));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                 SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
