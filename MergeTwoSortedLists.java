/*
Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example 1:
Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: l1 = [], l2 = []
Output: []

Example 3:
Input: l1 = [], l2 = [0]
Output: [0]
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        
        ArrayList<Integer> placeHolder = populateIntoArrayListSorted(l1, l2);
        ListNode result = new ListNode(placeHolder.get(0));
        ListNode pointer = result;
        
        for (int i = 1; i < placeHolder.size(); i++) {
            result.next = new ListNode(placeHolder.get(i));
            result = result.next;
        }
        return pointer;
    }
    
    public ArrayList<Integer> populateIntoArrayListSorted(ListNode l1, ListNode l2) {
        ArrayList<Integer> result = new ArrayList<>();
        while (l1 != null) {
            result.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            result.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(result);
        return result;
    }
}