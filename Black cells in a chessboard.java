// Given n (n is even), determine the number of black cells in an n×n chessboard.

// Input Format
// The only line of the input contains a single integer n.

// Output Format
// Output the number of black cells in an n×n chessboard.

// Constraints
// 2≤n≤100
// n is even
// Sample Input 1 
// 8
// Sample Output 1 
// 32
// Explanation


// There are 32 black cells and 32 white cells in an 8×8 chessboard. So the answer is 32.
  ___________________________________________________________________________________________________________________________________________________
  /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	   
	           int n=sc.nextInt();
	           System.out.println((n*n)/2);
	        
        	} 
        catch(Exception e) 	{ return; }
        
	}
}
