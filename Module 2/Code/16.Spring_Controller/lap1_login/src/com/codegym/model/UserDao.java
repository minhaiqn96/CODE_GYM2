package com.codegym.model;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User> users = new ArrayList<>();

    static {
        User u1 = new User();
        u1.setName("Hai");
        u1.setAge(18);
        u1.setEmail("hai@gmail.com");
        u1.setAccount("minhhai");
        u1.setPassword("hai123");
        users.add(u1);

        User u2 = new User();
        u2.setName("Na");
        u2.setAge(30);
        u2.setEmail("na@gmail.com");
        u2.setAccount("lyna");
        u2.setPassword("na123");
        users.add(u2);

        User u3 = new User();
        u3.setName("Tan");
        u3.setAge(40);
        u3.setEmail("tan@gmail.com");
        u3.setAccount("khactan");
        u3.setPassword("tan123");
        users.add(u3);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
