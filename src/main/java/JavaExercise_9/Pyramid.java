package JavaExercise_9;

import javax.swing.*;

public class Pyramid {
    private String letter = "*";

    public Pyramid() {
    }

    public Pyramid(String letter) {
        this.letter = letter;
    }

    public void printStar(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n-1-i; j >0; j--) {
                System.out.printf(" ");

                }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.printf(letter);
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        Pyramid rt = new Pyramid();
        rt.printStar(6);
    }
}
