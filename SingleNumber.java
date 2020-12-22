/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
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