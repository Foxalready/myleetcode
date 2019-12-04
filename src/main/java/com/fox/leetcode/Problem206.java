package com.fox.leetcode;

import com.alibaba.fastjson.JSON;

/**
 * description:反转链表
 * author foxalready
 * created 2019-12-02 0:03
 **/
public class Problem206 {

    public static void main(String[] args) {

        Problem206 problem206 = new Problem206();
        problem206.solute();
    }

    private void solute() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

//        while (listNode1 != null) {
//            System.out.println(listNode1.val);
//            listNode1 = listNode1.next;
//        }


        ListNode reverseList = reverseList(listNode1);

        while (reverseList != null) {
            System.out.println(reverseList.val);
            reverseList = reverseList.next;
        }


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

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        //链表前面的指针
        ListNode prev = null;
        //链表当前的指针
        ListNode curr = head;

        //每次循环，都将当前指针指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            //临时节点，暂存当前节点的下一节点，用于后移
            ListNode tmpNode = curr.next;
            //将当前节点指向它前面的节点
            curr.next = prev;
            //前指针后移
            prev = curr;
            //当前指针后移
            curr = tmpNode;
        }

        return prev;
    }


    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
