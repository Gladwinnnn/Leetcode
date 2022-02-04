// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant extra space.

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]

// Input: nums = [1,1,2]
// Output: [1]

// Input: nums = [1]
// Output: []

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> checkList = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int number:nums) {
            if (!checkList.containsKey(number)) checkList.put(number,1);
            else checkList.put(number, checkList.get(number) + 1);
        }
        
        for (int number:checkList.keySet()) {
            if (checkList.get(number) == 2) result.add(number);
        }
        
        return result;
    }
}