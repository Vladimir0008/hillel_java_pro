package com.hillel.homeWork.sandBox.dao;

import com.hillel.homeWork.sandBox.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UserDaoTest {

    private UserDao dao = new UserDaoImpl();;

    @Test
    void getUserByUserName_Should_Return_True() throws Exception {
        User volodymyr = dao.getUserByUserName("Volodymyr");
        assertThat(volodymyr).isNotNull();
        assertThat(volodymyr.getUsername()).isEqualTo("Volodymyr");

    }

    @Test
    void getUserByUserName_Null_user() throws Exception {
        User bob = dao.getUserByUserName("Bob");
        assertThat(bob).isNull();
    }

    @Test
    void findAllUsers_Contain() throws Exception {
        List<User> allUsers = dao.finAllUsers();
        assertThat(allUsers).contains(new User("Volodymyr", "Admin"));
    }

}