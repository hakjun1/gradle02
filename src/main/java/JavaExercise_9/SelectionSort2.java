package JavaExercise_9;

import java.util.Arrays;

interface StatementStrategy {//Template Callback패턴
    boolean apply(int a,int b);
}

public class SelectionSort2 {
    public int[] selectionSort(int[] arr,StatementStrategy stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minidx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (stmt.apply(arr[minidx],arr[j]))//바뀌는 부분 패턴
                    minidx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = tmp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort2 selectionSort2 = new SelectionSort2();
        selectionSort2.selectionSort(arr,(a,b)-> a<b);//내림차순
        selectionSort2.selectionSort(arr,(a,b)-> a>b);//오름차순
    }

}

