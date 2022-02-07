// You are given two strings s and t.

// String t is generated by random shuffling string s and then add one more letter at a random position.

// Return the letter that was added to t.

// Input: s = "abcd", t = "abcde"
// Output: "e"
// Explanation: 'e' is the letter that was added.

// Input: s = "", t = "y"
// Output: "y"

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> placeHolder = new HashMap<>();
        
        for (int i = 0; i < t.length(); i++) {
            if (placeHolder.containsKey(t.charAt(i))) placeHolder.put(t.charAt(i), placeHolder.get(t.charAt(i)) + 1);
            else placeHolder.put(t.charAt(i), 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (placeHolder.containsKey(s.charAt(i))) placeHolder.put(s.charAt(i), placeHolder.get(s.charAt(i)) - 1);
        }
        
        for (char temp:placeHolder.keySet()) {
            if (placeHolder.get(temp) == 1) return temp;
        }
        
        return '\u0000';
    }
}