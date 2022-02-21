// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.

// Input: nums = [1,2]
// Output: 2
// Explanation:
// The first distinct maximum is 2.
// The second distinct maximum is 1.
// The third distinct maximum does not exist, so the maximum (2) is returned instead.

// Input: nums = [2,2,3,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2 (both 2's are counted together since they have the same value).
// The third distinct maximum is 1.

class Solution {
    public int thirdMax(int[] nums) {
        HashMap<Integer,Integer> placeHolder = new HashMap<>();
        
        for (int number:nums) {
            placeHolder.put(number,1);
        }
        
        int[] newArray = new int[placeHolder.size()];
        int counter = 0;
        for (int number:placeHolder.keySet()) {
            newArray[counter] = number;
            counter++;
        }
        
        Arrays.sort(newArray);
        if (newArray.length >= 3) return newArray[newArray.length - 3];
        return newArray[newArray.length - 1];
    }
}