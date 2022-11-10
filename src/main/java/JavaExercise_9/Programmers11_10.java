package JavaExercise_9;
import java.util.*;

public class Programmers11_10 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i==0) list.add(arr[i]);
            else if(arr[i] != arr[i - 1]) list.add(arr[i]);
            }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
        }




    public static void main(String[] args) {
        Programmers11_10 pro = new Programmers11_10();
        pro.solution(new int[]{1,1,3,3,0,1,1});
    }
}