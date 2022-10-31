package JavaExercise;

public class PrepareTest {
    public int[] solution(int[] answer) {

        /*
        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
         */
        //학생들 정답
        int[] student1 = {1,2,3,4,5}; //5
        int[] student2 = {2,1,2,3,2,4,2,5}; //8
        int[] student3 = {3,3,1,1,2,2,4,4,5,5}; //10
        //카운트
        int Student1AnsWerCnt = 0;
        int Student2AnsWerCnt = 0;
        int Student3AnsWerCnt = 0;
        //나머지를 이용
        for(int i=0; i<answers.length; i++){
            if (answers[i] == one[i % 5]) {
                Student1AnsWerCnt ++;
            }
            if (answers[i] == two[i % 8]) {
                Student2AnsWerCnt ++;
            }
            if (answers[i] == three[i % 10]) {
                Student3AnsWerCnt ++;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        // 1번 answer --> 5
        // 2번 answer --> 0
    }



}
