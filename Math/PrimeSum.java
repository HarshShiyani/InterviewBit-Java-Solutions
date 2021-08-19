/*
Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
NOTE A solution will always exist. read Goldbach’s  conjecture

Example:

Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.
If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then
[a, b] < [c, d] 
If a < c OR a==c AND b < d. 
*/

public class PrimeSum {
    public ArrayList<Integer> primesum(int A) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(int i=2; i<=A/2; i++){
            if(isPrime(i) && isPrime(A-i)){
                res.add(i);
                res.add(A-i);
                return res;
            }
        }
        return res;
    }
    
   public boolean isPrime(int num){
       for(int i = 2; i<=Math.sqrt(num); i++){
           if(num % i == 0)
               return false;
       }
       return true;
   }
}
