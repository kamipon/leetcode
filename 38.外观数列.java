/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String s = countAndSay(n - 1);
        char[] sArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sArr.length;) {
            char c = sArr[i];
            int count = 0;
            while (i < sArr.length && sArr[i] == c) {
                count++;
                i++;
            }
            sb.append(count).append(c);
        }
        return sb.toString();
    }
}
// @lc code=end
