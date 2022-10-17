package JavaExercise_9;

import java.util.Scanner;

public class RightTriangle {


    public void printStar(int input) {

        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%s","*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
       RightTriangle rt = new RightTriangle();
       rt.printStar(6);


        }
    }

