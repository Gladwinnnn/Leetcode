// Given the head of a singly linked list, return true if it is a palindrome.

// Input: head = [1,2,2,1]
// Output: true

// Input: head = [1,2]
// Output: false

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
    public boolean isPalindrome(ListNode head) {
        ListNode pointer1 = head;
        ListNode newListNode = new ListNode();
        
        // appending to new ListNode
        while (pointer1 != null) {
            ListNode node = new ListNode(pointer1.val);
            node.next = newListNode;
            newListNode = node;
            pointer1 = pointer1.next;
        }
        
        while (head != null) {
            if (head.val != newListNode.val) {
                return false;
            }
            head = head.next;
            newListNode = newListNode.next;
        }
        return true;
    }
}