package week4.java;

import java.util.Arrays;

public class Algorithm_1114 {
    public static void solution(int n) {

        int[] check = new int[n + 1];  // 2 ~ n까지의 정수 전부를 처음엔 0으로 초기화하여
        // 소수로 간주(0과 1은 제외)
        for (int i = 2; i < Math.sqrt(n) + 1 ; i++) {
            if(check[i] == 0) {  // i가 소수인 경우
                // i를 제외한 모든 배수 지우기
                int j = 2;
                while(i * j <= n) {
                    check[i*j] = 1;
                    j++;
                }
            }
        }
        // 모든 소수 출력하기
        for (int i = 2; i <= n; i++) {
            if(check[i] == 0)
                System.out.printf("%d ",i);
        }
    }
    }





