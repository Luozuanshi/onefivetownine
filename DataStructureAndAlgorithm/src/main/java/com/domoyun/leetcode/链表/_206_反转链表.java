package com.domoyun.leetcode.链表;

/**
 * 反转链表
 * 例子: 5-4-3-2-1
 * 反转  1-2-3-4-5
 */
public class _206_反转链表 {
    /**
     * 递归方式
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode newHead = reverseList(head.next);
        newHead.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 非递归方式
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode newHead = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }

}
