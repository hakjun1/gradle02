package JavaExercise_9;

public class SquareStar {
    void printSquare(int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        SquareStar squareStar = new SquareStar();
        squareStar.printSquare(3);



    }
}
