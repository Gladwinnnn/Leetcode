Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Input: head = [], val = 1
Output: []

Input: head = [7,7,7,7], val = 7
Output: []

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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        
        ArrayList<Integer> checkList = new ArrayList<>();
        while (head != null) {
            if (head.val != val) checkList.add(head.val);
            head = head.next;
        }
        
        if (checkList.size() == 0) return null;
        
        ListNode placeHolder = new ListNode(checkList.get(0));
        ListNode result = placeHolder;
        for (int i = 1; i < checkList.size(); i++) {
            placeHolder.next = new ListNode(checkList.get(i));
            placeHolder = placeHolder.next;
        }
        return result;
    }
}