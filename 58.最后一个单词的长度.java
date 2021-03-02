/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        char[] sArr = s.toCharArray();
        int count = 0;
        for (int i = sArr.length - 1; 0 <= i; i--) {
            if (sArr[i] != ' ') {
                count++;
            } else if (count != 0 && sArr[i] == ' ') {
                return count;
            }
        }
        return count;
    }
}
// @lc code=end
