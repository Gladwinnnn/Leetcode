/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     String test;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        try{
            long[] array1 = getArray(l1);
            long[] array2 = getArray(l2);
            long total = summation(array1,array2);
            long[] newArray = toArray(total);

            ListNode newListNode = new ListNode((int)newArray[0]);

            for (int i =1; i<newArray.length; i++){
                newListNode = new ListNode((int)newArray[i],newListNode);   
            }

            return newListNode;    
        } catch (NumberFormatException e) {
            String placeHolder1 = "";
            String placeHolder2 = "";
            
            while (l1.next != null) {
                placeHolder1 += l1.val;
                l1 = l1.next;
            }
            placeHolder1 += l1.val;
            
            while (l2.next != null) {
                placeHolder2 += l2.val;
                l2 = l2.next;
            }
            placeHolder2 += l2.val;
            
            String newPlaceHolder1 = reverse(placeHolder1);
            String newPlaceHolder2 = reverse(placeHolder2);
            
            BigInteger value1 = new BigInteger(newPlaceHolder1);
            BigInteger value2 = new BigInteger(newPlaceHolder2);
            BigInteger addResult = value1.add(value2);
            
            String addResultString = addResult.toString();
            
            int[] anotherArray = new int[addResultString.length()];
            for (int i = 0; i < addResultString.length(); i++){
                anotherArray[i] = Integer.parseInt("" + addResultString.charAt(i));
            }
            
            ListNode anotherNode = new ListNode(anotherArray[0]);
            for (int i =1; i<anotherArray.length; i++){
                 anotherNode = new ListNode(anotherArray[i],anotherNode);   
            }
            
            return anotherNode;
        }
    }
    
    public long[] getArray(ListNode node) {
        int count = 0;
        ListNode tempNode = node;
        
        while (node.next != null) {
            count++;
            node = node.next;
        }
        
        count++;
        
        long[] array = new long[count];
        int position = count-1;
        
        while (tempNode.next != null) {
            array[position] = tempNode.val;
            position--;
            tempNode = tempNode.next;
        }
        
        array[position] = tempNode.val;
        
        return array;
    }
    
    public long summation(long[] array1, long[] array2) {
        String placeHolder1 = "";
        String placeHolder2 = "";
        
        for (long value:array1) {
            placeHolder1 += value;
        }
        
        for (long value:array2) {
            placeHolder2 += value;
        }
        
        long total = Long.parseLong(placeHolder1) + Long.parseLong(placeHolder2);
        return total;
    }
    
    public long[] toArray(long value){
        String placeHolder = "" + value;
        long[] array = new long[placeHolder.length()];
        
        for (int i = 0; i < placeHolder.length(); i++){
            array[i] = Integer.parseInt("" + placeHolder.charAt(i));
        }
        
        return array;
    }
    
    public String reverse(String input) {
        String result = "";
        
        for (int i = input.length()-1;i>=0;i--){
            result += input.charAt(i);
        }
        
        return result;
    }
}