package week4.java;

import java.io.IOException;

public class CodeUp_1859 {

    public static String sum(int num) {
        if(num==0) return "";
        return "*"+sum(num-1);
    }

    public static void printStar(int n) {
        if (n==0) return;
        //n은 작아지지만
        //출력은 1부터 n까지
        printStar(n-1);
        System.out.println(sum(n));
    }
    public static void main(String[] args) throws IOException {
        printStar(5);
    }
}
