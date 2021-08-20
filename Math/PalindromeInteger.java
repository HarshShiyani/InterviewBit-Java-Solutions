/*
Problem Description:

Determine whether an integer is a palindrome. Do this without extra space.
A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed. Negative numbers are not palindromic.

Example :
Input : 12121
Output : True

Input : 123
Output : False

*/

public class PalindromeInteger {
    public int isPalindrome(int A)
    {
        if(A < 0)
            return 0;
            
        long res = 0;
        long temp = A;
        while(temp != 0){
            res = (res * 10) + (temp % 10);
            temp /=10;
        }

        if(res == A)
            return 1;

        return 0;
    }
}
