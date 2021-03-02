/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int curr : nums) {
            sum = Math.max(sum + curr, curr);
            max = Math.max(sum, max);
        }
        return max;
    }
}
// @lc code=end
