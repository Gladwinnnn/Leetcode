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

class Solution {  
    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        StringBuilder placeHolder = new StringBuilder();
        
        while (x > 0) {
            int temp = x % 10;
            placeHolder.append("" + temp);
            x /= 10;
        }
        
        try{
            if (isNegative){
                return -Integer.parseInt(placeHolder.toString());
            } else {
                return Integer.parseInt(placeHolder.toString());
            }
        } catch(NumberFormatException e){
            return 0;
        }
    }
}