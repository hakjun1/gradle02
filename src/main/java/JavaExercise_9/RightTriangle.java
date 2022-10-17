package JavaExercise_9;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%s","*");
            }
            System.out.println();
        }

    }
}
