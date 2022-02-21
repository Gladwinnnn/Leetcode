// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// Input: nums = [1,1]
// Output: [2]

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
//         HashSet<Integer> placeHolder = new HashSet<>();
//         for (int number:nums) {
//             placeHolder.add(number);
//         }
        
//         ArrayList<Integer> result = new ArrayList<>();
//         for (int i = 1; i < nums.length + 1; i++) {
//             if (!placeHolder.contains(i)) result.add(i);
//         }
        
//         return result;
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length + 1; i++) {
            if (Arrays.binarySearch(nums, i) < 0) result.add(i);
        }
        
        return result;
    }
}