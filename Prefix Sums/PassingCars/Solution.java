// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] e = new int[A.length];

        e[0] = A[0] == 0 ? 1 : 0;
        for (int i = 1; i < A.length; i++) {
            e[i] = e[i - 1];
            if (A[i] == 0) {
                e[i]++;
            }
        }

        int pairs = 0;
        for (int v = 0; v < A.length; v++) {
            if (A[v] == 1) {
                if (pairs + e[v] > 1000000000) {
                    return -1;
                }
                pairs += e[v];
            }
        }

        return pairs;
    }
}
