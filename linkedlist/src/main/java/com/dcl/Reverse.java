package com.dcl;

/**
 * 单向链表反转
 *
 * @author dcl
 * @since 2021/4/26
 **/
public class Reverse {

    public static void main(String[] args) {

        LinkedNode node5 = new LinkedNode(5, null);
        LinkedNode node4 = new LinkedNode(4, node5);
        LinkedNode node3 = new LinkedNode(3, node4);
        LinkedNode node2 = new LinkedNode(2, node3);
        LinkedNode node1 = new LinkedNode(1, node2);
        LinkedNode newNode = iterator(node1);
        System.out.println(node1);

    }

    static class LinkedNode {

        int val;

        LinkedNode next;

        public LinkedNode(int val, LinkedNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 迭代器方式
     **/
    static LinkedNode iterator(LinkedNode head) {


        LinkedNode prev = null, next;
        LinkedNode curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }


}
