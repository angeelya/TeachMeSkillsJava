package work20.home.taskStar;

import work20.home.Staff;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class Service {
    private Connection connection;
    private Statement statement;
    private String message;

    private final String DRIVER="com.mysql.cj.jdbc.Driver",DB_URL="jdbc:mysql://localhost/",DATABASE_NAME = "work20",LOGIN="root",PASS="mysql";

   public void createDatabase()
   {  try{
       Class.forName(DRIVER).getDeclaredConstructor().newInstance();
       connection=DriverManager.getConnection(DB_URL,LOGIN,PASS);
       statement=connection.createStatement();
       statement.executeUpdate("create database IF NOT EXISTS "+DATABASE_NAME);
       statement.close();
       connection.close();
   } catch (SQLException | ClassNotFoundException | NoSuchMethodException | InstantiationException |
            IllegalAccessException | InvocationTargetException e) {
        e.printStackTrace();
    }
   }
    public void createTable() {
        try {
            connection = DriverManager.getConnection(DB_URL+DATABASE_NAME, LOGIN, PASS);
            statement = connection.createStatement();
            statement.executeUpdate("create table IF NOT EXISTS usersapp (id bigint primary key auto_increment ,login varchar(200),age int)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public UsersApp getByIdUser(String id) {
        UsersApp usersApp = null;
        try {
            usersApp = new UsersApp();
            ResultSet userInformation = statement.executeQuery("select * from usersapp where id=" + id);
            if (userInformation.next() && userInformation.getLong("id") != 0) {
                usersApp.setId(userInformation.getLong("id"));
                usersApp.setLogin(userInformation.getString("login"));
                usersApp.setAge(userInformation.getInt("age"));
            } else usersApp = null;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usersApp;
    }

    public String putUser(UsersApp usersApp) {
        message = "Insert isn't successful";
        try {
            if (statement.executeUpdate("insert into usersapp(login,age) value('" + usersApp.getLogin() + "'," + usersApp.getAge().toString() + ")") > 0)
                message = "Insert is successful";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return message;
    }

    public String updateLogin(String id, String login) {
         message = "Update isn't successful";
        try {
            if (statement.executeUpdate("update usersapp set login='" + login + "'where id=" + id) > 0)
                message = "Update is successful";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return message;
    }

    public String deleteById(String id) {
        message="Delete isn't successful";
        try {
            if (statement.executeUpdate("delete from usersapp where id=" + id) > 0)
                message = "Delete is successful";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return message;
    }
}

