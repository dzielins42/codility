// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] partialSum = new int[A.length];
        int sum = A[0];
        partialSum[0] = 0;
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
            partialSum[i] = partialSum[i - 1] + A[i - 1];
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            int a = partialSum[i];
            int b = sum - partialSum[i];
            int diff = Math.abs(a - b);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
