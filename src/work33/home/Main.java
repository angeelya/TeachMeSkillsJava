package work33.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task1");
        User user = new User(1L, "Io", "564635734"),
                user1 = new User(1L, "Io", "564635734"),
                user2 = new User(1L, "Io", "564635734");
        System.out.println(user.equals(user1));
        System.out.println(user.equals(user2));
        System.out.println(user1.equals(user2));

        System.out.println("Task2");
        cloneUser();
    }

    private static void cloneUser() {
        List<UserObj> userObjs = new ArrayList<>(List.of(new UserObj(1l, "Il", new Cat("Didi")), new UserObj(2l, "Elena", new Cat("Lili"))));
        UserObj userObj, userClone;
        System.out.println("Enter select cloning level\n 1-easy cloning\n2-deep cloning\n and choose user" +
                "\n example, 1 2");
        String[] enter = in.nextLine().split(" ");
        try {
            Integer cloning = Integer.valueOf(enter[0]);
            Long id = Long.valueOf(enter[1]);
            userObj = getUser(userObjs, id);
            if (userObj != null) {
                System.out.println(userObj);
                if (cloning == 1) {
                    userClone = userObj.clone();
                    System.out.println(userClone);
                } else if (cloning == 2) {
                    userClone = userObj.cloneDeep();
                    System.out.println(userClone);
                } else System.out.println("There is no such level of cloning");
            } else System.out.println("No such user");
        } catch (NumberFormatException e) {
            System.out.println("It isn't level or user's id");
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static UserObj getUser(List<UserObj> userObjs, Long id) {
        UserObj user = null;
        for (UserObj userObj : userObjs) {
            if (userObj.getId() == id)
                user = userObj;
        }
        return user;
    }

}
