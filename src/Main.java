import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта класу UserDao
        UserDao userDao = new UserDao();

        // Створення та додавання пару користувачів
        User user1 = new User("Bob", 25);
        User user2 = new User("Kvasolia", 26);

        userDao.addUser(user1);
        userDao.addUser(user2);

        // Розвертання елементів масиву у зворотному порядку
        Collections.reverse(userDao.getStorage());

        // Виведення масиву на екран
        for (User user : userDao.getStorage()) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}