// Given four positive integers A, B, C, D, determine if there’s a rectangle such that the lengths 
// of its sides are A, B, C and D (in any order).
//If any such rectangle exist return 1 else return 0.

public class Solution {
    public int solve(int A, int B, int C, int D) {

        ArrayList<Integer> isRect = new ArrayList<>(Arrays.asList(A, B, C, D));

        Collections.sort(isRect);

        if(isRect.get(0) != isRect.get(1) || isRect.get(2) != isRect.get(3))
            return 0;

        return 1;
    }
}
