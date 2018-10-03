// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean[] check = new boolean[1000000];
        boolean any = false;

        for (int i = 0; i < A.length; i++) {
            if (A[i] - 1 >= 0) {
                check[A[i] - 1] = true;
                any = true;
            }
        }

        if (any) {
            for (int q = 0; q < check.length; q++) {
                if (!check[q]) {
                    return q + 1;
                }
            }
        }

        return 1;
    }
}
