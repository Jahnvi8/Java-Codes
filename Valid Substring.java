// Given a string S consisting only of opening and closing parenthesis 'ie '('  and ')', find out the length of the longest valid(well-formed) parentheses substring.
// NOTE: Length of smallest the valid substring ( ) is 2.

// Example 1:
// Input: S = "(()("
// Output: 2
// Explanation: The longest valid 
// substring is "()". Length = 2.
  
// Example 2:
// Input: S = "()(())("
// Output: 6
// Explanation: The longest valid 
// substring is "()(())". Length = 6.

// Your Task:  
// You dont need to read input or print anything. Complete the function findMaxLen() which takes S as input parameter and returns the maxlength.


// Expected Time Complexity:O(n)
// Expected Auxiliary Space: O(1)   


// Constraints:
// 1 <= |S| <= 105
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\
class Solution {
    static int findMaxLen(String S) {
        
           Stack<Integer> s=new Stack<>();
        int l=0,cl=0;
        s.push(-1);
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c=='('){
                s.push(i);
            }
            else {
                if(!s.isEmpty())
               { s.pop();
        
               }
                if(!s.isEmpty()){
                    l=Math.max(l,i-s.peek());
                }
                else s.push(i);
            }
        }
        return l;
    }
};
