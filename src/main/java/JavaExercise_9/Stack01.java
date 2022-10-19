package JavaExercise_9;

public class Stack01 {
    private int[] arr = new int[10000];//값을 넘겨서 10000개로 초기화후 리턴
    //외부로넘겼다
    private int pointer = 0;
    //int[]push에 arr[0]에만 들어가는것을 막기위해
    public Stack01() {
    }

    public Stack01(int size) {//기본생성자가 없으면 10000회색
        this.arr = new int[size];
    }

    public void push(int value) {

        this.arr[this.pointer] = value;
        this.pointer ++;
    }
    public int pop(){//pop는 파라미터가 없다 컴퓨터는 위에것만 보기때문
        //push 10 push 20 point 2
        int value = this.arr[this.pointer-1];

        this.pointer --;
        return value;
    }

    public int[] getArr() {
        return arr;
    }
}
