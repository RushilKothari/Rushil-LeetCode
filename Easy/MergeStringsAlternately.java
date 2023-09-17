/* Q- You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
*/

/* Solution - 
Approach 1 - Brute Force with String Concatenation
Create a new string variable and add each character of the string one by one alternatively.

Approach 2 - Using String Builder Class in Java
Time Complexity - O(n+m) 
We use a StringBuilder to efficiently build the merged string because string concatenation
(s = s + ...) in a loop can be inefficient due to string immutability. 
Using StringBuilder gives better performance and optimization as it makes Strings mutable.

Note - In Java, strings are immutable by default, which means that once a string object is created, its value cannot be changed.
When you perform operations on a string, such as concatenation, substring, or replacing characters, 
you're actually creating new string objects rather than modifying the existing one. 
Immutable strings help in security and thread-safety, however they are not very efficient.
This is why we often use StringBuilder and StringBuffer Classes as wherever security or thread-safety is not an issue.
This is because StringBuilder and StringBuffer Classes are mutable in nature.
*/

//Approach 1 - Brute Force with String Concatenation
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                s=s+word1.charAt(i);
            }
            if(i<word2.length()){
                s=s+word2.charAt(i);
            }
            i++;
        }
        return s;
    }
}

//Approach 2 - Using String Builder Class in Java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++)); //Appending each character from String word1
            sb.append(word2.charAt(j++)); //Appending each character from String word1
        }
        // Append the remaining characters from word1 and word2
        sb.append(word1.substring(i));
        sb.append(word2.substring(j));
        return sb.toString();
    }
}
