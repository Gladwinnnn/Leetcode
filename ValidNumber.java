/*
Validate if a given string can be interpreted as a decimal number.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
" -90e3   " => true
" 1e" => false
"e3" => false
" 6e-1" => true
" 99e2.5 " => false
"53.5e93" => true
" --6 " => false
"-+3" => false
"95a54e53" => false

Note: It is intended for the problem statement to be ambiguous. It would be best if you gathered all requirements up front before implementing one. 
However, here is a list of characters that can be in a valid decimal number:

Numbers 0-9
Exponent - "e"
Positive/negative sign - "+"/"-"
Decimal point - "."
Of course, the context of these characters also matters in the input.

Example 1:

Input: s = "0"
Output: true
Example 2:

Input: s = "3"
Output: true
*/

import java.util.*;

class Solution {
    public boolean isNumber(String s) {
        s = s.trim().toLowerCase();
        ArrayList<Character> temp = new ArrayList<>();
        temp.add('a');
        temp.add('b');
        temp.add('c');
        temp.add('d');
        temp.add('e');
        temp.add('f');
        temp.add('g');
        temp.add('h');   
        temp.add('i');
        temp.add('j');
        temp.add('k');
        temp.add('l');
        temp.add('m');
        temp.add('n');
        temp.add('o');
        temp.add('p');
        temp.add('q');
        temp.add('r');
        temp.add('s');
        temp.add('t');
        temp.add('u');
        temp.add('v');
        temp.add('w');
        temp.add('x');
        temp.add('y');
        temp.add('z');
        
        if (s.length() - 1 < 0) {
            return false;
        }
                 
        if (temp.contains(s.charAt(s.length()-1))) {
            return false;
        }
                 
        try {
            double placeHolder = Double.parseDouble(s);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}