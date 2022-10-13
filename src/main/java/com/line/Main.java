package com.line;

import com.line.domain.Hospital;
import com.line.paser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());// 객체생성
        String filename = "C:\\hospital_seoul.csv";
        List<Hospital> hospitals = hospitalFileController.readLines(filename);          //      인스턴스에 csv넣기

        System.out.println(hospitals.size());
        List<String> lines = new ArrayList<>();
        for (Hospital hospital : hospitals) {  //hospital은여기서만          //           과정을 거쳐서
            System.out.println(hospital.getId());//                                     아이디호출
        }
        String sqlFilename = "hospital_insert.sql";
        hospitalFileController.createANewFile(sqlFilename);
        hospitalFileController.writeLines(lines, sqlFilename);
    }
}
