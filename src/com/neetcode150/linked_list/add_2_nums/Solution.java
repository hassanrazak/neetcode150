package com.neetcode150.linked_list.add_2_nums;

public class Solution {


    public static void main(String[] args){

    }


   private static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;

        while(l1 != null || l2 != null){
            int x = l1 !=null ? l1.val : 0;
            int y = l2 !=null ? l2.val : 0;

            int sum = x + y + carry;

            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if(l1 !=null) l1 = l1.next;
            if(l2 !=null) l1 = l2.next;

        }

        if(carry > 0){
            current.next = new ListNode(carry);
        }

        return result.next;

 }
}
