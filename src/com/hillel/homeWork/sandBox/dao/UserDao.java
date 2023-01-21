package com.hillel.homeWork.sandBox.dao;

import com.hillel.homeWork.sandBox.model.User;

import java.util.List;

public interface UserDao {

    User getUserByUserName(String name) throws Exception;

    List<User> finAllUsers();
}
