/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> placeHolder = new ArrayList<>();
        
        if (head == null) {
            return null;
        }
        
        while (head.next != null) {
            if (!placeHolder.contains(head.val)) {
                placeHolder.add(head.val);
            }
            head = head.next;
        }
        
        if (!placeHolder.contains(head.val)) {
                placeHolder.add(head.val);
            }
        
        Collections.sort(placeHolder, Collections.reverseOrder());
        
        ListNode result = new ListNode(placeHolder.get(0));
        for (int i = 1; i < placeHolder.size(); i++) {
            result = new ListNode(placeHolder.get(i), result);

        }
        
        return result;
    }
}