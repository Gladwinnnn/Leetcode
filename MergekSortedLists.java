/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6

Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> placeHolder = new ArrayList<>();
        
        for (ListNode temp:lists) {
            try {
                while (temp.next != null) {
                placeHolder.add(temp.val);
                temp = temp.next;
                }
            placeHolder.add(temp.val);   
            } catch (NullPointerException e) {
                continue;
            }
        }
        
        Collections.sort(placeHolder, Collections.reverseOrder());
        
        try {
            ListNode result = new ListNode(placeHolder.get(0));
            for (int i = 1; i < placeHolder.size(); i++) {
                result = new ListNode(placeHolder.get(i), result);
            }
            return result;   
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
}