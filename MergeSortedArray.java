/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
*/

import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> placeHolder = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            placeHolder.add(nums1[i]);
        }
        
        for (int i = 0; i < n; i++) {
            placeHolder.add(nums2[i]);
        }
        
        Collections.sort(placeHolder);
        
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = placeHolder.get(i);
        }
    }
}