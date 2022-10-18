package com.dbexercise;


import com.dbexercise.domain.User;

import java.sql.*;
import java.util.Map;

import static java.sql.DriverManager.getConnection;

public class UserDao {

    private Connection makeConnection() throws SQLException {
        Map<String, String> env = System.getenv();

        Connection c = DriverManager.getConnection(env.get("DB_HOST"),
                env.get("DB_USER"), env.get("DB_PASSWORD"));
        return c;
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
            Connection c= makeConnection();

            // Query문 작성
            PreparedStatement pstmt = c.prepareStatement("INSERT INTO users(id, name, password) VALUES(?,?,?);");
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
//        Map<String, String> env = System.getenv();
//        String dbHost = env.get("DB_HOST");
//        String dbUser = env.get("DB_USER");
//        String dbPassword =env.get("DB_PASSWORD");//
//
//        Class.forName("com.mysql.cj.jdbc.Driver");//mysql을 찾는것
//        Connection conn = getConnection(dbHost,dbUser,dbPassword);//db연결
//        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name,password) VALUES(?,?,?)");
//        //인서트쿼리 직접작성
//        ps.setString(1,user.getId());
//        ps.setString(2,user.getName());
//        ps.setString(3,user.getPassword());
//
//        ps.executeUpdate();//컨트롤 알트엔터
//        ps.close();
//        conn.close();
    }
//    public User get(String id) throws ClassNotFoundException, SQLException {//SELECT 구현
//        Map<String, String> env = System.getenv();
//        String dbHost = env.get("DB_HOST");
//        String dbUser = env.get("DB_USER");
//        String dbPassword =env.get("DB_PASSWORD");//
//
//        Class.forName("com.mysql.cj.jdbc.Driver");//mysql을 찾는것
//        Connection conn = getConnection(dbHost,dbUser,dbPassword);//db연결
//        PreparedStatement ps = conn.prepareStatement("SELECT id,name,password FROM users WHERE id =?");
//        //인서트쿼리 직접작성
//        ps.setString(1,id);
//        ResultSet rs = ps.executeQuery();//ResultSet은 executeQuery()를 했을때 ResultSet(쿼리실행결과가 담겨있음)를 반환
//        rs.next();
//        User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
//        rs.close();
//        ps.close();
//        conn.close();
//        return user;
//    }
    public User findById(String id) throws RuntimeException {
        Map<String, String> env = System.getenv();

        try {
            // DB접속 (ex sql workbeanch실행)
            Connection c = makeConnection();

            // Query문 작성
            PreparedStatement pstmt = c.prepareStatement("SELECT * FROM users WHERE id = ?");
            pstmt.setString(1, id);

            // Query문 실행
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            User user = new User(rs.getString("id"), rs.getString("name"),
                    rs.getString("name"));

            rs.close();
            pstmt.close();
            c.close();

            return user;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add(new User("7","Ruru","1234qwer"));
       // User user = userDao.get("1");
        //System.out.println(user.getName());
    }
}

