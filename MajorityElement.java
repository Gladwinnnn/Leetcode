/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Hashtable<Integer,Integer> placeHolder = new Hashtable<>();
        for (int temp:nums){
            if (!placeHolder.containsKey(temp)) {
                placeHolder.put(temp,1);
            } else {
                int counter = placeHolder.get(temp);
                placeHolder.put(temp,counter+1);
            }
        }
        
        int placeHolder2 = placeHolder.get(nums[0]);
        int majority = nums[0];
        
        for (int temp:placeHolder.keySet()) {
            if (placeHolder.get(temp) > placeHolder2){
                placeHolder2 = placeHolder.get(temp);
                majority = temp;
            }
        }
        return majority;
    }
}