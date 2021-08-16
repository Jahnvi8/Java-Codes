// Transform the algebraic expression with brackets into RPN form (Reverse Polish Notation). Two-argument operators: +, -, *, /, ^ (priority from the lowest to the highest), brackets ( ). Operands: only letters: a,b,...,z. Assume that there is only one RPN form (no expressions like a*b*c).

// Input
// t [the number of expressions <= 100]
// expression [length <= 400]
// [other expressions]
// Text grouped in [ ] does not appear in the input file.

// Output
// The expressions in RPN form, one per line.
// Example
// Input:
// 3
// (a+(b*c))
// ((a+b)*(z+x))
// ((a+t)*((b+(a+c))^(c+d)))

// Output:
// abc*+
// ab+zx+*
// at+bac++cd+^*
______________________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	           int t=sc.nextInt();
	           while((t--)!=0)
	             {
	                String s=sc.next();
	                Stack<Character> st=new Stack<>();
	                String ans="";
	                for(int i=0;i<s.length();i++){
	                    
	                    switch(s.charAt(i)){
	                        case '(': break;
	                        
	                        case '+':
	                            
	                        case '-':
	                         
	                        case '*':
	                                      
	                        case '/':
	                            
	                        case '^': 
	                             st.push(s.charAt(i));
	                             break;
	                            
	                        case ')':
	                            ans+=st.pop();
	                            break;
	                            
	                       default:
	                         ans+=s.charAt(i);
	                         break;
	                        
	                            
	                    }
	                }
	            
	          System.out.println(ans);
	             }
	        
        	} 
        catch(Exception e) 	{ return; }
        
	}
}
