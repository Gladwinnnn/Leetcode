// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Input: nums = [3,2,3]
// Output: [3]

// Input: nums = [1]
// Output: [1]

// Input: nums = [1,2]
// Output: [1,2]

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int criteria = nums.length / 3;
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> checkList = new HashMap<>();
        
        for (int number:nums) {
            if (!checkList.containsKey(number)) checkList.put(number, 1);
            else checkList.put(number, checkList.get(number) + 1);
        }
        
        for (int number:checkList.keySet()) {
            if (checkList.get(number) > criteria) result.add(number);
        }
        
        return result;
    }
}