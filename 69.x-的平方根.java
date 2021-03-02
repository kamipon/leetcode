/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x == 0)
            return x;

        long left = 1, right = x / 2;
        while (left < right) {
            long mid = (left + right + 1) / 2;
            long pow = mid * mid;
            if (pow > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        return (int) left;
    }
}
// @lc code=end
