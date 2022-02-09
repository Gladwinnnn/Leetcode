// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

// Input: nums = [3,3,7,7,10,11,11]
// Output: 10

class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> checkList = new HashMap<>();
        for (int number:nums) {
            if (!checkList.containsKey(number)) checkList.put(number, 1);
            else checkList.put(number, checkList.get(number) + 1);
        }
        
        for (int number:checkList.keySet()) {
            if (checkList.get(number) == 1) return number;
        }
        
        return 0;
    }
}