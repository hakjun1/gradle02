package week4.java;

import java.util.PriorityQueue;

public class Scovile {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);//우선순위 큐에 넣는다
        }
        while (pq.size() >= 2 && pq.peek() < K) {
            int mix= pq.poll()+(pq.poll()*2);
            //맨앞에있는게 K보다 작을때 섞는다
            pq.add(mix);
            answer++;
        }
        if(pq.peek() < K) return -1;
        return answer;

    }

}
//문제 1 런타임에러
//while (pq.size() >= 2 && pq.peek() < K)
//문제2 시간
//if(pq.peek() < K) return -1;
