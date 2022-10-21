package JavaExercise_9;

public class SolveBracket {
    public boolean solution(String s) {
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

}
