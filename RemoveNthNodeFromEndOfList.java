Given the head of a linked list, remove the nth node from the end of the list and return its head.

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Input: head = [1], n = 1
Output: []

Input: head = [1,2], n = 1
Output: [1]

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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int lengthOfNode = 0;
        ListNode pointer = head;
        
        while (pointer != null) {
            lengthOfNode++;
            pointer = pointer.next;
        }
        
        if (lengthOfNode == 1) return null;
        
        int positionToDelete = lengthOfNode - n;
        int currentPosition = 0;
        pointer = head;
        
        if (positionToDelete == 0) return head.next;
        
        while (pointer != null) {
            if (++currentPosition == positionToDelete) {
                pointer.next = pointer.next.next;
            }
            pointer = pointer.next;
        }
        
        return head;
    }
}