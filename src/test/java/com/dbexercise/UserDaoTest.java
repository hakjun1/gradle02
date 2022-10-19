package com.dbexercise;


import com.dbexercise.domain.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
     //   UserDaoAbstract userDao = new UserDaoAbstract(new LocalConnectionMaker2());
      UserDaoAbstract userDao = new UserDaoFactory().awsUserDao();
      //User.팩토리에서 사용
       User user = new User("4","hakjun","1123");
       userDao.add(user);

//        User selectedUser = userDao.findById("8");
//       Assertions.assertEquals("hakjun",selectedUser.getName());
//      Assertions.assertEquals("1123",selectedUser.getPassword());

    }
}