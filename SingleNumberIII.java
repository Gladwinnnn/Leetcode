// Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

// You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer.

// Input: nums = [-1,0]
// Output: [-1,0]

// Input: nums = [0,1]
// Output: [1,0]

class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> checkList = new HashMap<>();
        
        for (int number:nums) {
            if (!checkList.containsKey(number)) checkList.put(number, 1);
            else checkList.put(number, checkList.get(number) + 1);
        }
        
        int counter = 0;
        int[] result = new int[2];
        
        for (int number:checkList.keySet()) {
            if (checkList.get(number) == 1) {
                result[counter] = number;
                counter++;
            }
        }
        
        return result;
    }
}