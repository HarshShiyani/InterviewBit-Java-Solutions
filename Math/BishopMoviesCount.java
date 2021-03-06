/*
  Given the position of a Bishop (A, B) on an 8 * 8 chessboard.
  Your task is to count the total number of squares that can be visited by the Bishop in one move.
  The position of the Bishop is denoted using row and column number of the chessboard.
  
  Problem Constraints:
  1 <= A, B <= 8

  Input Format:
  First argument is an integer A denoting the row number of the bishop.
  Second argument is an integer B denoting the column number of the bishop.
*/

public class BishopMoviesCount {
    
    public int solve(int A, int B) {
        int count = 0;
        int row = A, col = B;
        
        while(--row>=1 && ++col<=8)count++;
        row = A;
        col = B;

        while(--row>=1 && --col>=1)count++;
        row = A;
        col = B;

        while(++row<=8 && ++col<=8)count++;
        row = A;
        col = B;

        while(++row<=8 && --col>=1)count++;
        row = A;
        col = B;

        return count;
    }
}
