// You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. 
// Capitalize the string by changing the capitalization of each word such that:

// If the length of the word is 1 or 2 letters, change all letters to lowercase.
// Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
// Return the capitalized title.

// Input: title = "capiTalIze tHe titLe"
// Output: "Capitalize The Title"
// Explanation:
// Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.

// Input: title = "First leTTeR of EACH Word"
// Output: "First Letter of Each Word"
// Explanation:
// The word "of" has length 2, so it is all lowercase.
// The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.

// Input: title = "i lOve leetcode"
// Output: "i Love Leetcode"
// Explanation:
// The word "i" has length 1, so it is lowercase.
// The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.

class Solution {
    public String capitalizeTitle(String title) {
        String[] placeHolder = title.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String individualString:placeHolder) {
            if (individualString.length() > 2) {
                StringBuilder firstLetter = new StringBuilder(individualString.substring(0,1).toUpperCase());
                StringBuilder remainingWord = new StringBuilder(individualString.substring(1, individualString.length()).toLowerCase());
                result.append(firstLetter).append(remainingWord).append(" ");
            } else {
                StringBuilder word = new StringBuilder(individualString.toLowerCase());
                result.append(word + " ");
            }
        }
        
        return result.toString().trim();
    }
}