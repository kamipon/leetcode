/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if (digits[len - 1] < 9) {
            digits[len - 1]++;
            return digits;
        } else {
            return carry(digits, len - 1);
        }
    }

    public int[] carry(int[] digits, int i) {
        digits[i] = 0;
        if (i == 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            return arr;
        }
        if (digits[i - 1] < 9) {
            digits[i - 1]++;
            return digits;
        } else {
            return carry(digits, i - 1);
        }

    }
}
// @lc code=end
