package JavaExercise_9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMultipleOf {
    /*
    50미만의 모든 소수를 구하는 에레토스테네스 체 알고리즘
     1. 2부터 50까지 숫자가 들어있는 49칸 리스트 만들기
     2. 리스트에 있는 원소 개수와 원소 출력 해보기
     3.만들 리스트에서 2를 제외한 모든 2의배수 지우기
     4. ...
     */

    public static void main(String[] args) {
        int N = 50;
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 == 0 && list.get(i)>2) list.remove(i);
            //nums.removeIf(num -> num % 2 == 0 && num != 2);
        }

        System.out.println(list);
        System.out.println(list.size());

        list.removeIf(num -> num % 3 == 0 && num != 3); //3을제외 3의배수
        list.removeIf(num -> num % 5 == 0 && num != 5);
        list.removeIf(num -> num % 7 == 0 && num != 7);
        System.out.println(list);
        System.out.println(list.size()); //15개

    }
}
