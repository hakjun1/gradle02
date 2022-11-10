package JavaExercise_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Programmers11_10stack {
    public int[] solution(int []arr) {
        Stack list = new Stack();
        for (int i = 0; i < arr.length; i++) {
            if(i==0) list.push(arr[0]);
            else if(arr[i] != arr[i - 1]) list.push(arr[i]);
        }
        int[] answer = new int[list.size()];
        for (int i = list.size()-1; i>=0; i--) {
            answer[i] = (int) list.pop();

        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }




    public static void main(String[] args) {
        Programmers11_10stack pro = new Programmers11_10stack();
        pro.solution(new int[]{1,1,3,3,0,1,1});
    }
}
