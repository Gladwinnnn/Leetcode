/*
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99
*/

import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Hashtable<Integer,Integer> placeHolder = new Hashtable<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (placeHolder.containsKey(nums[i])) {
                int counter = placeHolder.get(nums[i]);
                placeHolder.put(nums[i], counter + 1);
            } else {
                placeHolder.put(nums[i], 1);
            }
        }
        
        for (int value:placeHolder.keySet()) {
            if (placeHolder.get(value) == 1) {
                return value;
            }
        }
        return 0;      
    }
}