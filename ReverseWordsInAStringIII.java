// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

// Input: s = "God Ding"
// Output: "doG gniD"

class Solution {
    public String reverseWords(String s) {
        String[] placeHolder = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String string:placeHolder) {
            StringBuilder temp = new StringBuilder(string);
            result.append(temp.reverse() + " ");
        }
        
        return result.toString().trim();
    }
}