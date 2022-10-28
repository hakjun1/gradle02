package JavaExercise;

import java.util.HashSet;
import java.util.Set;

public class PoketMon {

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        //set을 만든이유는 중복을 없애기 위해[3,2,1,2] = [3,2,1]
        int N = nums.length / 2;// var = 나누는것에 따라 float가 될수도

        //set개수와 N중에서 하나를 return
        //length 6개 N = 3 [333222]
        if (set.size() < N) {
            return set.size();
        } else {
            return N;
        }

    }
}
