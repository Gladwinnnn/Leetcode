/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:

Input: "race a car"
Output: false
*/

class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        s = s.replace(" ","");
        String placeHolder = "";
        String placeHolder2 = "";
        
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57|| (int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122) {
                placeHolder += s.charAt(i) + "";   
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57|| (int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122) {
                placeHolder2 += s.charAt(i) + "";   
            }
        }
        
        placeHolder = placeHolder.trim();
        placeHolder2 = placeHolder2.trim();
        
        for (int i = 0; i < placeHolder.length(); i++) {
            if (placeHolder2.charAt(i) != placeHolder.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}