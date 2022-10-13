package com.line;

import com.line.paser.Parser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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
            for (String str : lines) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("success");
    }

}


