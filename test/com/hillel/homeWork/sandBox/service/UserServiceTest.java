package com.hillel.homeWork.sandBox.service;

import com.hillel.homeWork.sandBox.dao.UserDao;
import com.hillel.homeWork.sandBox.model.User;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

public class UserServiceTest {

    @Mock
    UserDao dao;

    private UserService userService;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
        this.userService = new UserService(dao);
    }

    @Test
    public void checkUserPresents_Should_Return_True() throws Exception {
        given(dao.getUserByUserName("Tolik")).willReturn(
                new User("Tolik"));

        boolean userExist =  userService.checkUserPresents(
                new User("Tolik"));

        assertThat(userExist).isTrue();

        //verify
        verify(dao).getUserByUserName("Tolik");
    }

    @Test
    public void checkUserPresents_Should_Return_False() throws Exception {
        given(dao.getUserByUserName("Tolik")).willReturn(
                null);

        boolean userExist =  userService.checkUserPresents(
                new User("Tolik"));

        assertThat(userExist).isFalse();
    }

    @Test(expected = Exception.class)
    public void checkUserPresents_Should_Throw_Exception() throws Exception {
        given(dao.getUserByUserName(anyString())).willThrow(Exception.class);

        boolean userExist =  userService.checkUserPresents(
                new User("Tolik"));

    }

    @Test
    public void testCaptor() throws Exception {
        given(dao.getUserByUserName(anyString())).willReturn(
                new User("Tolik")
        );
        boolean b = userService.checkUserPresents(new User("Tolik"));

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        verify(dao).getUserByUserName(captor.capture());
        String arg = captor.getValue();

        assertThat(arg).isEqualTo("Tolik");
    }
}