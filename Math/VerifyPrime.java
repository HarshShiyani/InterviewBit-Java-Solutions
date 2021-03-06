public class VerifyPrime {
    public int isPrime(int A) {
        
        if(A < 2) return 0;

        for(int i=2; i<=Math.sqrt(A); i++){
            if(A % i == 0)
                return 0;
        }
        return 1;
    }
}
