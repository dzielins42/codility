// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int expectedSum = 0;
        int sum = 0;
        boolean[] check = new boolean[N];
        for (int i = 0; i < N; i++) {
            int v = A[i] - 1;
            if (v >= N || check[v]) {
                return 0;
            }
            check[v] = true;

            sum += A[i];
            expectedSum += i + 1;
        }

        return (expectedSum == sum) ? 1 : 0;
    }
}
