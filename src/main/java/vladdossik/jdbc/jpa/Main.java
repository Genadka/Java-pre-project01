package vladdossik.jdbc.jpa;

import vladdossik.jdbc.jpa.model.User;
import vladdossik.jdbc.jpa.service.UserService;
import vladdossik.jdbc.jpa.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Kolya", "Ivanov", (byte) 25);
        userService.saveUser("Dasha", "Vasileva", (byte) 19);
        userService.saveUser("Jora","Krijovnikov", (byte) 43);
        userService.saveUser("Djonn", "konnor", (byte) 50);

        List<User> userList = userService.getAllUsers();
        userList.forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
