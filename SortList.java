/*
Given the head of a linked list, return the list after sorting it in ascending order.

Example 1:

Input: head = [4,2,1,3]
Output: [1,2,3,4]

Example 2:

Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

Example 3:

Input: head = []
Output: []
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
    public ListNode sortList(ListNode head) {
        List<Integer> placeHolder = new ArrayList<>();
        
        if (head == null) {
            return null;
        }
        
        while (head.next != null) {
            placeHolder.add(head.val);
            head = head.next;
        }
                
        placeHolder.add(head.val);
        Collections.sort(placeHolder, Collections.reverseOrder());
        
        ListNode valuePlaceHolder = new ListNode(placeHolder.get(0));
        for (int i = 1; i < placeHolder.size(); i++) {
            valuePlaceHolder = new ListNode(placeHolder.get(i), valuePlaceHolder);

        }
        
        return valuePlaceHolder;
    }
}