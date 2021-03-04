/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return maxDepth(root, 1);
    }

    public int maxDepth(TreeNode node, int depth) {
        if (node.left == null && node.right == null)
            return depth;
        int max = 0;
        if (node.left != null) 
            max = Math.max(max, maxDepth(node.left, depth + 1));
        if (node.right != null) 
            max = Math.max(max, maxDepth(node.right, depth + 1));
        return max;
    }
}
// @lc code=end

