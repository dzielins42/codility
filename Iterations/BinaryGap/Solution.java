// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int gap = 0;
        String binaryString = Integer.toBinaryString(N);
        char[] chars = binaryString.toCharArray();
        int i = 0;
        while (chars[i] != '1') {
            i++;
        }
        int tmp = 0;
        for (; i < chars.length; i++) {
            if (chars[i] == '0') {
                tmp++;
            } else if (chars[i] == '1') {
                if (tmp > gap) {
                    gap = tmp;
                }
                tmp = 0;
            }
        }
        return gap;
    }
}
