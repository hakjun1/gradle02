package com.dbexercise;

import com.dbexercise.domain.AwsUserDaoImpl;
import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        AwsUserDaoImpl userDao = new AwsUserDaoImpl();
      // User user = new User("12","EternityHwan","1123");
       userDao.add(new User("12","EternityHwan","1123"));

        User selectedUser = userDao.findById("12");
        Assertions.assertEquals("EternityHwan",selectedUser.getName());

    }
}