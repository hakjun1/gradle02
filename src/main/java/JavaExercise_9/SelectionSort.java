package JavaExercise_9;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

//        int i = 0;
//        int minIdx = 0;//무조건 0으로 했을때 문제생길 가능성

//        for (int j = 0; j < arr.length; j++) {
//            if (arr[minIdx]>arr[j]) minIdx = j;
//        }
//        int tmp = arr[0];
//        arr[0] = arr[minIdx];
//        arr[minIdx] = tmp;
//        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length - 1; i++) {
            int minidx = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[minidx] > arr[j])
                    minidx = j;
            }
            int tmp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));

    }
    }

