/* A string is a valid parentheses string (denoted VPS) if it meets one of the following:

It is an empty string "", or a single character not equal to "(" or ")",
It can be written as AB (A concatenated with B), where A and B are VPS's, or
It can be written as (A), where A is a VPS.
We can similarly define the nesting depth depth(S) of any VPS S as follows:

depth("") = 0
depth(C) = 0, where C is a string with a single character not equal to "(" or ")".
depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's.
depth("(" + A + ")") = 1 + depth(A), where A is a VPS.
For example, "", "()()", and "()(()())" are VPS's (with nesting depths 0, 1, and 2), and ")(" and "(()" are not VPS's.

Given a VPS represented as string s, return the nesting depth of s 

Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation: Digit 8 is inside of 3 nested parentheses in the string.

Example 2:
Input: s = "(1)+((2))+(((3)))"
Output: 3

Example 3:
Input: s = "1+(2*3)/(2-1)"
Output: 1

Example 4:
Input: s = "1"
Output: 0
 

Constraints:
1 <= s.length <= 100
s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
It is guaranteed that parentheses expression s is a VPS.       
________________________________________________________________________________________________
Method 1 (Uses Stack) 
A simple solution is to use a stack that keeps track of current open brackets. 
1) Create a stack. 
2) Traverse the string, do following for every character
     a) If current character is ‘(’ push it to the stack .
     b) If character is ‘)’, pop an element.
     c) Maintain maximum count during the traversal. 
Time Complexity : O(n) 
Auxiliary Space : O(n)

Method 2 ( O(1) auxiliary space ) 
This can also be done without using stack.  
1) Take two variables max and current_max, initialize both of them as 0.
2) Traverse the string, do following for every character
    a) If current character is ‘(’, increment current_max and 
       update max value if required.
    b) If character is ‘)’. Check if current_max is positive or
       not (this condition ensure that parenthesis are balanced). 
       If positive that means we previously had a ‘(’ character 
       so decrement current_max without worry. 
       If not positive then the parenthesis are not balanced. 
       Thus return -1. 
3) If current_max is not 0, then return -1 to ensure that the parenthesis
   are balanced. Else return max.                        */
   
   _____________________________________________________________________________________________
   
   import java.util.*;
   import java.util.Scanner;
   class Main{
      public static void main(String[] a){
          Scanner sc=new Scanner(System.in);
          System.out.println('enter string");
          String s=sc.nextLine();
          System.out.println("max depth is: "+ max_depth(s));
      }
      
      public static int max_depth(String s)
      {   int max = 0;

		int curr_max = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				curr_max++;
			} else if (c == ')') {
				if (curr_max > max) {
					max = curr_max;
				}
				curr_max;
			}
		}

		return max;
      }
   }











