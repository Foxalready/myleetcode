package com.fox.leetcode;

/**
 * description:反转链表
 * author foxalready
 * created 2019-12-02 0:03
 **/
public class Problem206 {

    public static void main(String[] args) {


    }

    private ListNode solute() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode2 = listNode1.next;
        listNode3 = listNode2.next;
        listNode4 = listNode3.next;
        listNode5 = listNode4.next;
        return null;
    }

    /**
     * 反转一个单链表。
     * <p>
     * 示例:
     * <p>
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     * <p>
     * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
     *
     * @param head
     * @return
     */
    private ListNode reverseList(ListNode head) {

        return null;
    }


    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
