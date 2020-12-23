/*
All DNA is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T', for example: "ACGAATTCCG". 
When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

Example 1:

Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]
Example 2:

Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]
*/

import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Hashtable<String,Integer> placeHolder = new Hashtable<>();
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            try {
                String temp = s.substring(i,i+10);
                if (!placeHolder.containsKey(temp)) {
                    placeHolder.put(temp,1);
                } else {
                    int counter = placeHolder.get(temp);
                    placeHolder.put(temp,counter+1);
                }   
            } catch (StringIndexOutOfBoundsException e) {
                continue;
            }
        }
        
        for (String words:placeHolder.keySet()) {
            if (placeHolder.get(words) > 1) {
                result.add(words);
            }
        }
        
        return result;
    }
}