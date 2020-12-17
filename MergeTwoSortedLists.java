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
import java.util.*;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {  
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null){
            ArrayList<Integer> resultArrayList = populateArrayList(l2);
            ListNode newListNode = new ListNode(resultArrayList.get(0));

            for (int i = 1; i < resultArrayList.size(); i++){
                newListNode = new ListNode(resultArrayList.get(i),newListNode); 
            }

            return newListNode;
            
        } else if (l2 == null) {
            ArrayList<Integer> resultArrayList = populateArrayList(l1);
            ListNode newListNode = new ListNode(resultArrayList.get(0));

            for (int i = 1; i < resultArrayList.size(); i++){
                newListNode = new ListNode(resultArrayList.get(i),newListNode); 
            }

            return newListNode;
        }
        
        ArrayList<Integer> resultArrayList = populateArrayList(l1, l2);
        ListNode newListNode = new ListNode(resultArrayList.get(0));

        for (int i = 1; i < resultArrayList.size(); i++){
            newListNode = new ListNode(resultArrayList.get(i),newListNode); 
        }

        return newListNode;   
    }
    
    public ArrayList<Integer> populateArrayList(ListNode l1, ListNode l2) {
        ArrayList<Integer> resultArrayList = new ArrayList<>();
        
        while (l1.next != null) {
            resultArrayList.add(l1.val);
            l1 = l1.next;
        }
        resultArrayList.add(l1.val);
        
        while (l2.next != null) {
            resultArrayList.add(l2.val);
            l2 = l2.next;
        }
        resultArrayList.add(l2.val);
        
        Collections.sort(resultArrayList);
        Collections.reverse(resultArrayList);
        return resultArrayList;
    }
    
    public ArrayList<Integer> populateArrayList(ListNode l1) {
        ArrayList<Integer> resultArrayList = new ArrayList<>();
        
        while (l1.next != null) {
            resultArrayList.add(l1.val);
            l1 = l1.next;
        }
        resultArrayList.add(l1.val);
        
        Collections.sort(resultArrayList);
        Collections.reverse(resultArrayList);
        return resultArrayList;
    }
}