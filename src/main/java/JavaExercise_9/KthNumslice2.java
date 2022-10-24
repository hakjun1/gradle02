package JavaExercise_9;

import java.util.Arrays;

public class KthNumslice2 {
    public int[] solution(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command :commands) {
            int[] slicedArr = Arrays.copyOfRange(arr, command[0]-1, command[1]);
            Arrays.sort(slicedArr);
            answer[idx++] = slicedArr[command[2]-1];
        }
        return answer;
    }

}
