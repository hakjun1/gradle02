package JavaExercise_9;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int find = 5;
        //중간값 찾기
        int left = 0;
        int right = nums.length - 1;
        int middle;//= (left+right)/2;
        //인덱스(시작점,끝점)옮기기
        // left = nums[middle] + 1;
        //같은지 비교하기
        while (right >= left) {
            middle = (right + left) / 2;

            if (find == nums[middle]) {
                System.out.println(middle);
                break;
            }
            if (find < nums[middle]) right = middle - 1;
            else left = middle + 1;
        }
    }
}
