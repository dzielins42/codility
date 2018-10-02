// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;

        int expectedSum = 0;
        for (int i = 0; i <= N; i++) {
            expectedSum += i + 1;
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }

        return expectedSum - sum;
    }
}
