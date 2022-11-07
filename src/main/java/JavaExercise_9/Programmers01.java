package JavaExercise_9;


import java.util.Scanner;

class Solution1 {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        boolean answer = true;
        while (x > 0) {
            sum += x%10; //나머지
            x/=10; //몫 저장
        }
        if (num % sum > 0)
            answer = false;

        System.out.println(answer);
        return answer;
    }

}

public class Programmers01 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        int input = 13;
        solution1.solution(input);

    }
}

