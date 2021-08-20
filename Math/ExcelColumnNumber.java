/*
Problem Description:
The input will be a string A, which will be having only uppercase English letters
and will denote a excel sheet column. 
You have to return the corresponding column number.

Input Format:
First and only argument is string A.

Output Format
Return an integer

Example Input
Input 1:
"A"
Input 2:
"AB"
Input 3:
"AZA"

Example Output
Output 1:
1
Output 2:
28
Output 3:
1353 
*/

public class ExcelColumnNumber {
    public int titleToNumber(String A) {

        int res = 0;
        int alpha = 0;
        int j = 0;
        for(int i=A.length()-1; i>=0; i--){
            alpha = A.charAt(i);
            res += (alpha - 64) * (int)(Math.pow(26, j));
            j++;
        }
        return res;
    }
}
