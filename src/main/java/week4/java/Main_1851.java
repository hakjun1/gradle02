package week4.java;


public class Main_1851 {
    private static void printNum(int num) {
        if (num == 0) {
            return;
        }
        System.out.printf("%s","*");
        printNum(num-1);
    }
}
