// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int N = S.length();
        int[] as = new int[N + 1];
        int[] gs = new int[N + 1];
        int[] cs = new int[N + 1];
        int[] ts = new int[N + 1];

        as[N] = gs[N] = cs[N] = ts[N] = 0;
        for (int q = N - 1; q >= 0; q--) {
            as[q] = as[q + 1];
            cs[q] = cs[q + 1];
            gs[q] = gs[q + 1];
            ts[q] = ts[q + 1];
            switch (S.charAt(q)) {
                case 'A':
                    as[q] += 1;
                    break;
                case 'C':
                    cs[q] += 1;
                    break;
                case 'G':
                    gs[q] += 1;
                    break;
                case 'T':
                    ts[q] += 1;
                    break;
            }
        }

        int M = P.length;
        int[] r = new int[M];
        for (int i = 0; i < M; i++) {
            int p = P[i];
            int q = Q[i];
            if (as[p] - as[q + 1] > 0) {
                r[i] = 1;
            } else if (cs[p] - cs[q + 1] > 0) {
                r[i] = 2;
            } else if (gs[p] - gs[q + 1] > 0) {
                r[i] = 3;
            } else if (ts[p] - ts[q + 1] > 0) {
                r[i] = 4;
            }
        }

        return r;
    }
}
