package com.hillel.homeWork.sandBox.service;

import com.hillel.homeWork.sandBox.dao.UserDao;
import com.hillel.homeWork.sandBox.model.User;

public class UserService {

    private UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public boolean checkUserPresents(User user) throws Exception {
        User desiredUser  = dao.getUserByUserName(user.getUsername());
        return desiredUser != null;
    }
}

