/*
* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.


Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
* 
*/

class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        String str = "";

        /*
        String longer = "";
        String shorter = "";

        if (word1.length() > word2.length())
        {
            longer = word1; 
            shorter = word2; 
        }

        if (word1.length() < word2.length())
        {
            longer = word2; 
            shorter = word1; 
        }

        if (word1.length() == word2.length())
        {
            longer = word1; // Just used for how long the loop goes so doesn't matter which is considered larger or shorter 
            shorter = word2; 
        }
            Ended up not using this ^^ 

         */


        for (int i = 0; i < word1.length(); i++)
        {
            str = str + word1.charAt(i); 
            for (int j = 0; j < word2.length(); j++)
            {
                str = str + word2.charAt(j); 
            }
        }
        return str; 
    }
}