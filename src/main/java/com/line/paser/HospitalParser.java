package com.line.paser;

import com.line.domain.Hospital;
//alt enter creat test
public class HospitalParser implements Parser<Hospital>{

    private String getsubdivision(String name) {
        String[] subdivisions = {"소아과", "피부과", "성형외과", "정형외과", "산부인과", "관절", "안과", "가정의학과", "비뇨기과", "치과","내과", "외과"};
        //내과 외과 뒤로뺌

        for(String subdivision : subdivisions){
            if (name.contains(subdivision)) {//contain() 특정 문자열 찾기 true;false
                return subdivision;
            }
        }
        return "";
    }


    @Override
    public Hospital parse(String str) { //한줄이 들어오면
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(","); //잘라서
        //subdivision 파싱해서넣자(예외 케이스 나올수도있다)

        String name = splitted[10];
        String subdivision = getsubdivision(name);

        return new Hospital(splitted[0],splitted[1],splitted[2],Integer.parseInt(splitted[6]),name,subdivision); // 배열 0번째 값을리턴한다
    }          //Hospital에 전달        //LineReader에서 result List에 값을 저장한다
}              //이러면 id에 저장된다

