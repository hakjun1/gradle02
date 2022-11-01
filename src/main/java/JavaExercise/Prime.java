package JavaExercise;

public class Prime {
    //2부터 num까지 전부 나누고 나머지를 계산
    //template callback = 함수를 변수로 받고싶을때
    boolean isPrime(int num,StatementStrategy stmt){
        for(int i=2; stmt.compare(i,num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prime prime = new Prime();

        System.out.println(prime.isPrime(13,(a,b)->a<b));
        System.out.println(prime.isPrime(17,(a,b)->a<b/2));
        System.out.println(prime.isPrime(19,(a,b)->a*a<b));

        boolean r = prime.isPrime(13, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a*a<=b;
            }
        });
        System.out.println(r);

    }
}

