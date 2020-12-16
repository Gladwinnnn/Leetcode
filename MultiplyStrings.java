/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
*/

import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger placeHolder1 = new BigInteger(num1);
        BigInteger placeHolder2 = new BigInteger(num2);
        BigInteger result = placeHolder1.multiply(placeHolder2);
        
        return "" + result;
    }
}