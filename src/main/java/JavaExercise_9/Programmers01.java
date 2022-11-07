package JavaExercise_9;


import java.util.Scanner;

class Solution1 {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        boolean answer = true;
        while ((x != 0)) {
            sum += x%10;
            x/=10;
        }
        if (num % sum != 0)
            answer = false;

        return answer;
    }

}

public class Programmers01 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        int input = 18;
        solution1.solution(input);

    }
}

