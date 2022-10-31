package JavaExercise;

import java.util.ArrayList;
import java.util.List;

public class PrepareTest {
    public int[] solution(int[] answers) {

        /*
        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
         */
        //1.학생들 정답
        int[] student1 = {1,2,3,4,5}; //5
        int[] student2 = {2,1,2,3,2,4,2,5}; //8
        int[] student3 = {3,3,1,1,2,2,4,4,5,5}; //10
        //2.카운트
//        int Student1AnsWerCnt = 0;
//        int Student2AnsWerCnt = 0;
//        int Student3AnsWerCnt = 0;
        int[] cnt = {0,0,0};
        //3.나머지를 이용
        for(int i=0; i<answers.length; i++){
            if (answers[i] == student1[i % 5]) {
                cnt[0]++;
            }
            if (answers[i] == student2[i % 8]) {
                cnt[1]++;
            }
            if (answers[i] == student3[i % 10]) {
                cnt[2]++;
            }
        }
        //3.리스트를 이용해서 정렬(Math.max)
        int maxScore = Math.max(cnt[0],Math.max(cnt[1],cnt[2]));
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if (maxScore == cnt[i]) {
                answerList.add(i+1);//0,1,2 이므로
            }
        }

        //4. answer배열에 담아서 리턴
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {

    }



}
