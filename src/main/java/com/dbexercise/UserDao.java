package com.dbexercise;


import com.dbexercise.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword =env.get("DB_PASSWORD");//

        Class.forName("com.mysql.cj.jdbc.Driver");//mysql을 찾는것
        Connection conn = DriverManager.getConnection(dbHost,dbUser,dbPassword);//db연결
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name,password) VALUES(?,?,?)");
        //인서트쿼리 직접작성
        ps.setString(1,"3");
        ps.setString(2,"hakjun");
        ps.setString(3,"1123");

        ps.executeUpdate();//컨트롤 알트엔터
        ps.close();
        conn.close();
    }
    public User get(String id) throws ClassNotFoundException, SQLException {//SELECT 구현
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword =env.get("DB_PASSWORD");//

        Class.forName("com.mysql.cj.jdbc.Driver");//mysql을 찾는것
        Connection conn = DriverManager.getConnection(dbHost,dbUser,dbPassword);//db연결
        PreparedStatement ps = conn.prepareStatement("SELECT id,name,password FROM users WHERE id =?");
        //인서트쿼리 직접작성
        ps.setString(1,id);
        ResultSet rs = ps.executeQuery();//ResultSet은 executeQuery()를 했을때 ResultSet(쿼리실행결과가 담겨있음)를 반환
        rs.next();
        User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
        rs.close();
        ps.close();
        conn.close();
        return user;
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        //userDao.add();
        User user = userDao.get("1");
        System.out.println(user.getName());
    }
}

