package com.hillel.homeWork.sandBox.dao;

import com.hillel.homeWork.sandBox.model.User;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("Volodymyr", "Admin"),
                new User("Yulia", "User"),
                new User("Oleh", "Guest"),
                new User("Andriy", "Owner")
        );
    }

    @Override
    public User getUserByUserName(String name) throws Exception {
        return users.stream().filter(u->u.getUsername().equals(name)).findAny().orElse(null);
    }

    @Override
    public List<User> finAllUsers() {
        return users;
    }
}
