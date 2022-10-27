package JavaExercise;

import java.util.HashMap;

public class ARacer3 {
    public String solution(String[] participant, String[] completion) {
        String answer ="";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for(String player : completion) hm.put(player, hm.get(player) -1);
        for(String key : hm.keySet()) {
            if(hm.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args){
        ARacer3 aRacer3 = new ARacer3();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(aRacer3.solution(participant, completion));
    }
}

