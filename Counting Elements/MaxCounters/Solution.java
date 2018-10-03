// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int max1 = 0;
        int max2 = 0;
        int[] c = new int[N];

        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                max2 = max1;
            } else {
                c[A[i] -1] = max2 > c[A[i] -1] ? max2 : c[A[i] -1];
                c[A[i] -1]++;
                max1 = c[A[i] -1] > max1 ? c[A[i] -1]  : max1;
            }
        }

        for (int q = 0; q < N; q++) {
            c[q] = c[q] > max2 ? c[q] : max2;
        }

        return c;
    }
}
