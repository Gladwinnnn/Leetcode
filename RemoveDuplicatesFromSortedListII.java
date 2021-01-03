/*
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Return the linked list sorted as well.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5
Example 2:

Input: 1->1->1->2->3
Output: 2->3
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
        Hashtable<Integer,Integer> placeHolder = new Hashtable<>();
        
        if (head == null) {
            return null;
        }
        
        while (head.next != null) {
            if (!placeHolder.containsKey(head.val)) {
                placeHolder.put(head.val, 1);
            } else {
                int counter = placeHolder.get(head.val);
                placeHolder.put(head.val, counter + 1);
            }
            head = head.next;
        }
        
        if (!placeHolder.containsKey(head.val)) {
                placeHolder.put(head.val, 1);
            } else {
                int counter = placeHolder.get(head.val);
                placeHolder.put(head.val, counter + 1);
            }
        
        List<Integer> placeHolder2 = new ArrayList<>();
        
        for (int temp:placeHolder.keySet()) {
            if (placeHolder.get(temp) == 1) {
                placeHolder2.add(temp);
            }
        }
        
        Collections.sort(placeHolder2, Collections.reverseOrder());
        
        if (placeHolder2.size() == 0) {
            return null;
        }
        
        ListNode result = new ListNode(placeHolder2.get(0));
        for (int i = 1; i < placeHolder2.size(); i++) {
            result = new ListNode(placeHolder2.get(i), result);
        }
        
        return result;
    }
}