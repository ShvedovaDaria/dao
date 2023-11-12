package issue14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        User user1 = new User("Bob", 25);
        User user2 = new User("Kvasolia", 26);

        userDao.addUser(user1);
        userDao.addUser(user2);

        Collections.reverse(userDao.getStorage());

        for (User user : userDao.getStorage()) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}