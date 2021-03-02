/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        char[] aStr = haystack.toCharArray();
        char[] bStr = needle.toCharArray();
        for (int i = 0, j = 0; i < aStr.length && j < bStr.length && bStr.length <= aStr.length;) {
            while (i < aStr.length && aStr[i] != bStr[j])
                i++;

            int count = 0;
            while (i < aStr.length &&j < bStr.length && aStr[i] == bStr[j]) {
                i++;
                j++;
                count++;
            }
            if (count == bStr.length) {
                return i - count;
            } else {
                j = 0;
                i = i - count + 1;
            }

        }
        return -1;
    }
}
// @lc code=end
