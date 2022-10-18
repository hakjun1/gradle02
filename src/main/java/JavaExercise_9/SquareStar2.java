package JavaExercise_9;

public class SquareStar2 {
    void printSquare(int x,int y) {
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        SquareStar2 squareStar2 = new SquareStar2();
        squareStar2.printSquare(3,5);



    }
}