// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]

class Solution {
    public void reverseString(char[] s) {
        StringBuilder placeHolder = new StringBuilder();
        
        for (int i = s.length - 1; i >= 0; i--) placeHolder.append(s[i]);
        
        for (int i = 0; i < placeHolder.length(); i++) s[i] = placeHolder.charAt(i);
    }
}