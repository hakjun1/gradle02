package JavaExercise_9;

import java.util.Arrays;

public class MultipleOf {
    public static void main(String[] args) {
        //100까지
        int cnt = 100;
        int[] nums = new int[cnt-1];//N-1개 만큼 2~50 49개
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks,true);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
        }


        //2의배수 , 4 , 6 , 8     //
        for (int i = 2; i < cnt; i+=2) {
            checks[i] = false;
        }
        for (int i = 4; i < cnt; i+=3) {
            checks[i] = false;
        }
        for (int i = 6; i < cnt; i+=4) {
            checks[i] = false;
        }
        for (int i = 8; i < cnt; i+=5) {
            checks[i] = false;
        }

    }

}
