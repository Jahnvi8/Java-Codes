/*    For a positive integer n let's define a function f:

f(n) =  - 1 + 2 - 3 + .. + ( - 1)nn

Your task is to calculate f(n) for a given integer n.

Input
The single line contains the positive integer n (1 ≤ n ≤ 1015).

Output
Print f(n) in a single line.

Examples
inputCopy
4
outputCopy
2
inputCopy
5
outputCopy
-3
Note
f(4) =  - 1 + 2 - 3 + 4 = 2

f(5) =  - 1 + 2 - 3 + 4 - 5 =  - 3    */
_____________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static int change(int n){
        return Integer.valueOf(Integer.toString(n).replace("0", ""));
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
    
	         long a=sc.nextLong();
	         if(a%2==0) System.out.println(a/2);
	         else {
	             System.out.print("-"+(a+1)/2);
	         }
	        
	        
	        

        	}
        catch(Exception e) 	{ return; }
	}
}
