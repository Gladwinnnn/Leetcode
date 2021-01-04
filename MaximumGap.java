/*
Given an unsorted array, find the maximum difference between the successive elements in its sorted form.

Return 0 if the array contains less than 2 elements.

Example 1:

Input: [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either
             (3,6) or (6,9) has the maximum difference 3.

Example 2:

Input: [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.
*/

import java.util.*;
import java.lang.*;

class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        
        List<Integer> placeHolder = new ArrayList<>();
        
        for (int temp:nums) {
            placeHolder.add(temp);
        }
        
        Collections.sort(placeHolder);
        
        int difference = Math.abs(placeHolder.get(0) - placeHolder.get(1));
        
        for (int i = 1; i < placeHolder.size()-1; i++) {
            if (Math.abs(placeHolder.get(i) - placeHolder.get(i+1)) > difference) {
                difference = Math.abs(placeHolder.get(i) - placeHolder.get(i+1));
            }
        }
        
        return difference;
    }
}