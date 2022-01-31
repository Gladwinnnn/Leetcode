/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     String test;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder placeHolder1 = new StringBuilder();
        StringBuilder placeHolder2 = new StringBuilder();
        
        while (l1 != null) {
            placeHolder1.append("" + l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            placeHolder2.append("" + l2.val);
            l2 = l2.next;
        }
        
        placeHolder1.reverse();
        placeHolder2.reverse();
        
        BigInteger bigInteger1 = new BigInteger(placeHolder1.toString());
        BigInteger bigInteger2 = new BigInteger(placeHolder2.toString());
        
        BigInteger placeHolderInteger = bigInteger1.add(bigInteger2);
        StringBuilder resultInteger = new StringBuilder("" + placeHolderInteger).reverse();
        
        
        ListNode placeHolderResult = new ListNode(Integer.parseInt("" + resultInteger.charAt(0)));
        ListNode result = placeHolderResult;
        
        for (int i = 1; i < resultInteger.length(); i++) {
            placeHolderResult.next = new ListNode(Integer.parseInt("" + resultInteger.charAt(i)));
            placeHolderResult = placeHolderResult.next;
        }
        
        return result;
    }
}