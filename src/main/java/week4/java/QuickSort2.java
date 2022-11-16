package week4.java;

public class QuickSort2 {
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx= 0;
        while (arr[leftIdx] < pivot) {
            leftIdx += 1;
        }
        while (arr[rightIdx] > pivot) {
            leftIdx -= 1;
        }

    }
}
