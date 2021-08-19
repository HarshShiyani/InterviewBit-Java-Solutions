/*
  Problem Description

  A items are to be delivered in a circle of size B.
  Find the position where the Ath item will be delivered if we start from a given position C.
  NOTE: Items are distributed at adjacent positions starting from C.

  Problem Constraints:
  1 <= A, B, C <= 108

  Example Input
  Input 1:
   A = 2
   B = 5
   C = 1
   
  Input 2:
   A = 8
   B = 5
   C = 2
  
  Example Output
  Output 1:
   2
   
  Output 2:
   4
*/

public class DistributeInCircle {
   
  public int solve(int A, int B, int C) {
        return (A+C - 1) % B == 0 ? B : ((A+C - 1) % B);
    }
}
