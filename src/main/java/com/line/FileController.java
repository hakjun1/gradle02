package com.line;

import com.dbexercise.domain.User;
import com.line.paser.Parser;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//파싱 리펙토링

public class FileController<T> {
    Parser<T> parser;

//구현체를 바꾸면 영원히 쓸수있는 로직 개선할수도있음

    public FileController(Parser<T> paser) {//생성자는 왜만들었지?
        this.parser = paser;        //HospitalPaser를 주입받는다
    }

    List<T> readLines(String filename) throws IOException {//한줄씩읽어서 어떤 리스트를 만드는 메소드
        List<T> result = new ArrayList<>(); //result에 리턴값 저장함
        BufferedReader br = new BufferedReader(new FileReader(filename));//파일을 읽는다
        String str;

        br.readLine();//한줄을 허공에 날린다 버퍼리드라인은 한줄씩 읽고 다음줄읽는다

        while ((str = br.readLine()) != null) {
            result.add(parser.parse(str));//        1. HospitalPaser에 읽어서 넘기고
            //파써에서 어떤 파씽을 한다 //      2. 스플릿한 값을 리턴받고
        }
        return result;//                            3. 다시 넘긴다
    }

    public void createANewFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
        System.out.println("Have a file generated?:" + file.exists());
    }

    public void writeLines(List<String> lines, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer
                    = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
            //한줄씩 쓰는 부분
            for (String str : lines) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("success");
    }


////////////////
public void add() throws SQLException, ClassNotFoundException {
    Map<String, String> env = System.getenv();
    String dbHost = env.get("DB_HOST");
    String dbUser = env.get("DB_USER");
    String dbPassword =env.get("DB_PASSWORD");//

    Class.forName("com.mysql.cj.jdbc.Driver");//mysql을 찾는것
    Connection conn = DriverManager.getConnection(dbHost,dbUser,dbPassword);//db연결
    PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name,password) VALUES(?,?,?)");
    //인서트쿼리 직접작성
    ps.setString(1,"1");
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
}


