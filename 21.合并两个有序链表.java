/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null)
            return l2;
        else if (l1 != null && l2 == null)
            return l1;
        else if (l1 == null && l2 == null)
            return null;
        else if (l1.val <= l2.val)
            return new ListNode(l1.val, mergeTwoLists(l1.next, l2));
        else
            return new ListNode(l2.val, mergeTwoLists(l2.next, l1));
    }
    // public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // ListNode result = new ListNode();
    // ListNode r = result;
    // while (l1 != null || l2 != null) {
    // // 移动l1
    // if (l2 == null || (l1 != null && l1.val <= l2.val)) {
    // r.next = new ListNode(l1.val);
    // l1 = l1.next;
    // } else {
    // // 移动l2
    // r.next = new ListNode(l2.val);
    // l2 = l2.next;
    // }
    // r = r.next;
    // }
    // return result.next;
    // }
}
// @lc code=end
