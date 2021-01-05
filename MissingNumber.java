/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?


Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

Example 4:

Input: nums = [0]
Output: 1
Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 1 is the missing number in the range since it does not appear in nums.
*/

class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> placeHolder = new ArrayList<>();
        
        for (int temp:nums) {
            placeHolder.add(temp);
        }
        
        Collections.sort(placeHolder);
        
        int min = placeHolder.get(0);
        int max = placeHolder.get(placeHolder.size() - 1);
        
        for (int i = min; i < max + 1; i ++) {
            if (!placeHolder.contains(i)) {
                return i;
            }
        }
        
        if (!placeHolder.contains(0)) {
            return 0;
        }
        
        return max + 1;
    }
}