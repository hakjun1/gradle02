package JavaExercise_9;

import java.util.Arrays;
import java.util.Stack;

public class SolveBracket {
    public boolean solution1(String s) {
        while(s.indexOf("()")>=0){
            s = s.replace("()", "");
        }

        return s.length() == 0;

//
//        System.out.println(s);
//        System.out.println(s.indexOf("()"));//이 문자열이 처음 등장하는 index
//        s = s.replace("()", "");
//        //s = s.replaceAll("\\(\\)", "");
//        System.out.println(s);
//
//        System.out.println(s.indexOf("()"));
//        return false;
    }

    public boolean solution2(String s) {

        while (s.indexOf("()")>=0) {
            String[] splitted = s.split("\\(\\)");
            s = String.join("", splitted);//join = 합친다
        }
        //System.out.println(Arrays.toString(splitted));

        return s.length() == 0;

    }

    public boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ('('==s.charAt(i)) {
                st.push(s.charAt(i));
              //  System.out.println(st.size());
            } else if (')' == s.charAt(i)) {
                if(st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }

}
//solution1,solution2 = 풀수는 있지만 속도가 안나와 프로그래머스 테스트를 통과못함