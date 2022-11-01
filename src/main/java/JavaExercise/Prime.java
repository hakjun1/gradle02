package JavaExercise;

public class Prime {
    //2부터 num까지 전부 나누고 나머지를 계산

    public static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(17));
        System.out.println(isPrime(19));
        System.out.println(isPrime(23));
    }
}

