package week4;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr){
        // i = 1 arr[1] jvs arr[0]
        // i = 2 arr[2] jvs arr[1]  루프를 떠올릴수 있다
        // i = 2 arr[1] jvs arr[0]
        //int j = i;
        for(int i=1; i<arr.length;i++){
            for(int j = 1; j>0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        //5에서 출발을 합니다
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort01 is = new InsertionSort01();
        arr = new int[]{5,8,6,2,4};
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}
