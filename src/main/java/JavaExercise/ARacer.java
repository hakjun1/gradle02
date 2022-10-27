package JavaExercise;

import java.util.HashMap;
import java.util.Map;

public class ARacer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key, 1);//참여한선수 1을 준다
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, 0);//완주한선수 0을 준다
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {//value가 1로 남아있는 key가 완주 못한선수
                return key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ARacer aRacer = new ARacer();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(aRacer.solution(participant,completion));
    }
}
