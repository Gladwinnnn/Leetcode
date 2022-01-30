// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

// Input: head = [1,2]
// Output: [2,1]

// Input: head = []
// Output: []

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
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        
        ListNode result = new ListNode(head.val); // 0 -> null
        head = head.next;
        
        while (head != null) {
            ListNode placeHolderNode = new ListNode(head.val);
            placeHolderNode.next = result;
            result = placeHolderNode;
            head = head.next;
        }
        
        return result;
    }
}