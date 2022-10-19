package com.dbexercise;


import com.dbexercise.domain.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)//이클래스를 특정해서


class UserDaoTest {

    @Autowired
    ApplicationContext context;

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
     //   UserDaoAbstract userDao = new UserDaoAbstract(new LocalConnectionMaker2());
      UserDaoAbstract userDao = context.getBean("awsUserDao",UserDaoAbstract.class);
      UserDaoAbstract userDao2 = context.getBean("awsUserDao",UserDaoAbstract.class);
        //주소값 같음
        System.out.println(userDao);
        System.out.println(userDao2);

      //User.팩토리에서 사용
       User user = new User("5","hakjun","1123");
       userDao.add(user);

//        User selectedUser = userDao.findById("8");
//       Assertions.assertEquals("hakjun",selectedUser.getName());
//      Assertions.assertEquals("1123",selectedUser.getPassword());

    }
}