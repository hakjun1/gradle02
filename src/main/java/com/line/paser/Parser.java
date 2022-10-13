package com.line.paser;

//다형성 적용 <T> 를 뚫어주고 리턴하게 해야한다
public interface Parser<T> {
    T parse(String str);//파일에서 읽어와야하기때문에 string 하지만 병원데이터,인구이동등 어떤파일을 파싱하느냐
    //에 따라 hospital,people등 자바의 오브젝트가 결정되기때문에 T로 나둔다
}
