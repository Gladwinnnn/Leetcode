// Given a 32-bit signed integer, reverse digits of an integer.

// Note:
// Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, 
// assume that your function returns 0 when the reversed integer overflows.

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
// Example 4:

// Input: x = 0
// Output: 0

import java.lang.*;

class Solution {
    boolean isNegative = false;
    
    public int reverse(int x) {
        if (x < 0){
            isNegative = true;
        }
        
        try{
            x = Math.abs(x);
            String placeHolder = "" + x;
            String resultString = "";

            for (int i = placeHolder.length()-1; i >= 0; i--){
                resultString += placeHolder.charAt(i);
            }

            int result = Integer.parseInt(resultString);

            if (isNegative){
                return -result;
            } return result;   
        } catch(NumberFormatException e){
            return 0;
        }
    }
}