/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false
*/

import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character,Integer> placeHolder1 = new Hashtable<>();
        Hashtable<Character,Integer> placeHolder2 = new Hashtable<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!placeHolder1.containsKey(s.charAt(i))) {
                placeHolder1.put(s.charAt(i),1);
            } else {
                int counter = placeHolder1.get(s.charAt(i));
                placeHolder1.put(s.charAt(i),counter+1);
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            if (!placeHolder2.containsKey(t.charAt(i))) {
                placeHolder2.put(t.charAt(i),1);
            } else {
                int counter = placeHolder2.get(t.charAt(i));
                placeHolder2.put(t.charAt(i),counter+1);
            }
        }
        
        if (placeHolder1.size() != placeHolder2.size()) {
            return false;
        }
        
        
        return placeHolder1.equals(placeHolder2);
    }
}