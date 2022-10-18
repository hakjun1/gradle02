package com.dbexercise;


import com.dbexercise.domain.User;
import com.dbexercise.domain.UserDaoAbstract;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDaoAbstract userDao = new UserDaoAbstract();
       //User user = new User("9","hakjun","1123");
       userDao.deleteAll("8");

//        User selectedUser = userDao.findById("8");
//       Assertions.assertEquals("hakjun",selectedUser.getName());
//      Assertions.assertEquals("1123",selectedUser.getPassword());

    }
}