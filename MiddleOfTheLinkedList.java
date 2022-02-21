// Given the head of a singly linked list, return the middle node of the linked list.

// If there are two middle nodes, return the second middle node.

// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.

// Input: head = [1,2,3,4,5,6]
// Output: [4,5,6]
// Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

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
    public ListNode middleNode(ListNode head) {
        ArrayList<Integer> placeHolder = new ArrayList<>();
        while (head != null) {
            placeHolder.add(head.val);
            head = head.next;
        }
        
        int middle = placeHolder.size() / 2;
        ListNode pointer = new ListNode(placeHolder.get(middle));
        ListNode result = pointer;
        
        for (int i = middle + 1; i < placeHolder.size(); i++) {
            pointer.next = new ListNode(placeHolder.get(i));
            pointer = pointer.next;
        }
        
        return result;
    }
}