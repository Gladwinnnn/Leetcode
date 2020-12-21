/*
Given an unsorted integer array nums, find the smallest missing positive integer.

Follow up: Could you implement an algorithm that runs in O(n) time and uses constant extra space.?

Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
*/

import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        ArrayList<Integer> placeHolder = new ArrayList<>();
        
        placeHolder.add(0);
        for (int value:nums) {
            placeHolder.add(value);
        }
        
        if (placeHolder.size() == 0) {
            return 1;
        }
        
        Collections.sort(placeHolder);
        
        for (int i = 0; i < placeHolder.size(); i++) {
            if (!placeHolder.contains(i)) {
                return i;
            }
        }
        
        return placeHolder.get(placeHolder.size()-1) + 1;
    }
}