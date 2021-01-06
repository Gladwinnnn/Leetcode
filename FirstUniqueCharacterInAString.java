/*
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.
*/

import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 0) {
            return -1;
        }
        Hashtable<Character,Integer> placeHolder = new Hashtable<>();
        
        for (int i = 0; i < s.length(); i++){
            if (!placeHolder.containsKey(s.charAt(i))){
                placeHolder.put(s.charAt(i),1);
            } else {
                int counter = placeHolder.get(s.charAt(i));
                placeHolder.put(s.charAt(i),counter+1);
            }
        }
        System.out.print(placeHolder);
        
        for (int i = 0; i < s.length(); i++){
            if (placeHolder.get(s.charAt(i)) == 1){
                return i;
            }
        }
        
        return -1;
    }
}