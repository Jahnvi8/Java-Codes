// Given a string s, find the length of the longest substring without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
// Example 4:

// Input: s = ""
// Output: 0
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.
_____________________________________________________________________________________________________________________________________________________
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=Integer.MIN_VALUE;    
        if(s.length()==0) return 0;
        Set<Character> hs=new HashSet<>();
        while(j<s.length()){
            hs.add(s.charAt(j));
            if(hs.size()==j-i+1)
                max=Math.max(max,j-i+1);
            else{
                boolean f=false;
                while(s.charAt(i)!=s.charAt(j)){
                    hs.remove(s.charAt(i));
                    f=true;i++;
                } 
              i++;              
                max=Math.max(max,j-i+1);
            }
            j++;
            
        }
   System.out.println(hs);
        return max;
    }
}
