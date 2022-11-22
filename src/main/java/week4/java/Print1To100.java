package week4.java;

public class Print1To100 {
    public static void print1to(int n) {
        if (n>100) return;
        System.out.println(n);
        print1to(n+1);
    }

    public static void main(String[] args) {
       print1to(1);
    }
}
