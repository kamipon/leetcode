/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        return (findKth(nums1, 0, m, nums2, 0, n, left) + findKth(nums1, 0, m, nums2, 0, n, right)) * 0.5;
    }

    public int findKth(int[] A, int aStart, int aEnd, int[] B, int bStart, int bEnd, int k) {
        int aLen = aEnd - aStart;
        int bLen = bEnd - bStart;
        if (aLen > bLen) {
            return findKth(B, bStart, bEnd, A, aStart, aEnd, k);
        }
        if (aLen <= 0) {
            return B[bStart + k - 1];
        }
        if (k == 1) {
            return Math.min(A[aStart], B[bStart]);
        }
        int i = aStart + Math.min(aLen, k / 2) - 1;
        int j = bStart + Math.min(bLen, k / 2) - 1;
        if (A[i] <= B[j]) {
            return findKth(A, i + 1, aEnd, B, bStart, bEnd, k - (i - aStart) - 1);
        } else {
            return findKth(A, aStart, aEnd, B, j + 1, bEnd, k - (j - bStart) - 1);
        }
    }
}
// @lc code=end
