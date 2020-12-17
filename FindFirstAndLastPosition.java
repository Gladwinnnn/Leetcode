/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

Follow up: Could you write an algorithm with O(log n) runtime complexity?

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        boolean doesNotContain1 = true;
        boolean doesNotContain2 = true;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                doesNotContain1 = false;
                break;
            }
        }
        
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == target) {
                result[1] = i;
                doesNotContain2 = false;;
                break;
            }
        }
        
        if (doesNotContain1 && doesNotContain2) {
            result[0] = -1;
            result[1] = -1;
        }
        return result;
    }
}