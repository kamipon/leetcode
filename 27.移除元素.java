/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            while (i <= j && nums[i] != val)
                i++;
            while (i <= j && nums[j] == val)
                j--;
            if (i < j)
                nums[i++] = nums[j--];
        }
        return j + 1;
    }
}
// @lc code=end
