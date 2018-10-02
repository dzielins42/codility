// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int q = X;
        boolean[] check = new boolean[X];
        for (int i = 0; i < A.length; i++) {
            if (!check[A[i] - 1]) {
                check[A[i] - 1] = true;
                q--;
            }
            if (q == 0) {
                return i;
            }
        }
        return -1;
    }
}
