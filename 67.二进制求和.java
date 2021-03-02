import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();
        if (as.length < bs.length) {
            char[] temp = as;
            as = bs;
            bs = temp;
        }
        for (int i = bs.length - 1; 0 <= i; i--) {
            if (bs[i] == '1') {
                as = plusOne(as, as.length - (bs.length - i));
            } else {
                bs[i] = '1';
            }
        }
        return new String(as);

    }

    public char[] plusOne(char[] s, int i) {

        if (i == 0 && s[i] == '1') {
            s[i] = '0';
            char[] newS = new char[s.length + 1];
            newS[0] = '1';
            System.arraycopy(s, 0, newS, 1, s.length);
            return newS;
        }

        if (s[i] == '0') {
            s[i] = '1';
            return s;
        } else {
            s[i] = '0';
            return plusOne(s, i - 1);
        }
    }
}
// @lc code=end
