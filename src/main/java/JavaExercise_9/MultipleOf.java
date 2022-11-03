package JavaExercise_9;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleOf {
    public static void main(String[] args) {
        //100까지
        int cnt = 50;
        int[] nums = new int[cnt-1];//N-1개 만큼 2~50 49개
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks,true);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
        }
        //0,1,[2],3,[4],5,[6],7,8,9
        //2,3,[4],5,[6],7,[8],9,10,11
        int multipleOf = 2;
        for (int i = 2; i < nums.length; i+=multipleOf) {
            checks[i] = false;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (checks[i]) {
                list.add(nums[i]);
            }
        }
        System.out.println(list);

        printNums(nums,checks);
    }
    public static void printNums(int[] nums, boolean[] checks) {
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) {
                System.out.printf("%d|", nums[i]);
                cnt++;
            }
        }
        System.out.println();
        System.out.println("size:"+cnt);
    }
}

//        for (int i = 2; i < cnt; i+=2) {
//            checks[i] = false;
//        }
//        for (int i = 4; i < cnt; i+=3) {
//            checks[i] = false;
//        }
//        for (int i = 6; i < cnt; i+=4) {
//            checks[i] = false;
//        }
//        for (int i = 8; i < cnt; i+=5) {
//            checks[i] = false;
//        }

