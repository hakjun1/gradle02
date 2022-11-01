package JavaExercise;

public class Prime {
    //2부터 num까지 전부 나누고 나머지를 계산
    //template callback = 함수를 변수로 받고싶을때
    boolean someOperation(int a, int b) {
        return a < b;
    }

    boolean isPrime(StatementStrategy stmt){
        for(int i=2; stmt.compare(i,num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Prime prime = new Prime();
        boolean r = prime.isPrime(17);
        System.out.println(r);

        System.out.println(prime.isPrime(13));
        System.out.println(prime.isPrime(17));
        System.out.println(prime.isPrime(19));

        System.out.println(prime.isPrime(24));
    }
}

