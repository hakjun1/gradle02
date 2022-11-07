package JavaExercise_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers02 {
    public int[] solution(int[] arr, int divisor) {

        int[] answer = arr;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <answer.length; i++) {
            if((answer[i]%divisor)==0)
            list.add(answer[i]);
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        } else{
            Collections.sort(list);
            int[] answer2 = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer2[i] = list.get(i);
            }
            return answer2;
        }

    }

    public static void main(String[] args) {
        Programmers02 programmers02 = new Programmers02();
        int[] arr = {5,9,7,10};
        int divisor = 5;
        programmers02.solution(arr,divisor);
    }

}
