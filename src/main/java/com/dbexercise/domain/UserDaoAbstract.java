package com.dbexercise.domain;


import java.sql.*;
import java.util.Map;

public class UserDaoAbstract {
    private final ConnectMaker connectMaker;// = new AwsConnectionMaker();//추가 초기화
//
//    public abstract Connection makeConnection() throws SQLException;
////        Map<String, String> env = System.getenv();
////
////        Connection c = DriverManager.getConnection(env.get("DB_HOST"),
////                env.get("DB_USER"), env.get("DB_PASSWORD"));
////        return c;


    public UserDaoAbstract() {

        this.connectMaker = new AwsConnectionMaker2();
    }

    public UserDaoAbstract(ConnectMaker connectMaker) {
        this.connectMaker = connectMaker;
    }

    public void delete(String id) throws SQLException {
        Map<String, String> env = System.getenv();

        Connection c = DriverManager.getConnection(env.get("DB_HOST"),
                env.get("DB_USER"), env.get("DB_PASSWORD"));
    }

    public void add(User user) throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();

        try {
            // DB접속 (ex sql workbeanch실행)
            Connection c = connectMaker.makeConnection();

            // Query문 작성
            PreparedStatement pstmt = c.prepareStatement("INSERT INTO users(id, name, password) VALUES(?,?,?)");
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getPassword());

            // Query문 실행
            pstmt.executeUpdate();

            pstmt.close();
            c.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public User findById(String id) throws RuntimeException {
        Map<String, String> env = System.getenv();

        try {
            // DB접속 (ex sql workbeanch실행)
            Connection c = connectMaker.makeConnection();

            // Query문 작성
            PreparedStatement pstmt = c.prepareStatement("SELECT * FROM users WHERE id = ?");
            pstmt.setString(1, id);

            // Query문 실행
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            User user = new User(rs.getString("id"), rs.getString("name"),
                    rs.getString("password"));

            rs.close();
            pstmt.close();
            c.close();

            return user;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int getCount() {
        return 0;
    }
////////////
    public void deleteAll(String id) {
        Map<String, String> env = System.getenv();
        try {
            // DB접속 (ex sql workbeanch실행)
            Connection c = connectMaker.makeConnection();

            // Query문 작성
            PreparedStatement pstmt = c.prepareStatement("DELETE  FROM users WHERE id = ?");
            pstmt.setString(1, id);

            pstmt.executeUpdate();

            pstmt.close();
            c.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        UserDaoAbstract userDao = new UserDaoAbstract();
       // userDao.add(new User("7","Ruru","1234qwer"));
//       User user = userDao.findById("10");
//        System.out.println(user.getName());
    }
}

