// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

 

// Example 1:

// Input: s = "hello"
// Output: "holle"
// Example 2:

// Input: s = "leetcode"
// Output: "leotcede"
 

// Constraints:

// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.
____________________________________________________________________________________________________________________________________
class Solution {
    
    public boolean isVowel(char c){
         if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
          return true;
    else
          return false;    
    }
    
    public String reverseVowels(String s) {
        Stack<Character> st=new Stack<>();
        String res="";
        
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                st.push(s.charAt(i));
            }
        }
        
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
               res+=(char)st.peek();
                st.pop();
            }
            else
            {
                res+=s.charAt(i);
            }
            
        }
        return res;
    }
}
