package com.line;

import com.dbexercise.UserDao;
import com.line.domain.Hospital;
import com.line.paser.HospitalParser;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());// 객체생성
        String filename = "C:\\hospital_seoul.csv";
        List<Hospital> hospitals = hospitalFileController.readLines(filename);          //      인스턴스에 csv넣기

        List<String> sqlStatments = new ArrayList<>();
        for (Hospital hospital : hospitals) {
            sqlStatments.add(hospital.getSqlInsertQuery2());//리스트에 몇만개의 쿼리가 저장된다
        }
        String sqlFilename = "seoul_hospital_insert.sql";
        hospitalFileController.createANewFile(sqlFilename); //파일생성
        hospitalFileController.writeLines(sqlStatments,sqlFilename); //넣는다

//        System.out.println(hospitals.size());
//        List<String> lines = new ArrayList<>();
//        for (Hospital hospital : hospitals) {  //hospital은여기서만          //           과정을 거쳐서
//            System.out.println(hospital.getId());//                                     아이디호출
//        }
//        String sqlFilename = "hospital_insert.sql";
//        hospitalFileController.createANewFile(sqlFilename);
//        hospitalFileController.writeLines(lines, sqlFilename);
        UserDao userDao = new UserDao();
        userDao.add();
        // User user = userDao.get("1");
        //System.out.println(user.getName());
    }
}
