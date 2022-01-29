// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.

import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1 = arrayToList(nums1);
        
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2 = arrayToList(nums2);
        
        if (nums1.length > nums2.length) return intersectList(arrayList1,arrayList2);
        return intersectList(arrayList2,arrayList1);
    }
    
    public ArrayList<Integer> arrayToList(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        return result;
    }
    
    // O(nlog(n))
    public int[] intersectList(ArrayList<Integer> largerArray, ArrayList<Integer> smallerArray) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int number:smallerArray) {
            if (binarySearch(largerArray,number)) {
                result.add(number);
            }
        }
        
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
    
    // O(log(n)) complexity
    public boolean binarySearch(ArrayList<Integer> nums, int number) {
        int upper = nums.size() - 1;
        int lower = 0;
        
        while (lower <= upper) {
            int middle = (lower + upper)/2;
            if (nums.get(middle) == number) {
                nums.remove(middle);
                return true;   
            }
            else if (nums.get(middle) < number) lower = middle + 1;
            else if (nums.get(middle) > number) upper = middle - 1;
        }
        return false;
    }
}