// You're given two numbers L and R. Print all odd numbers between L and R (both inclusive) in a single line separated by space, in ascending (increasing) order.

// Input:
// First-line will contain two numbers L and R.
// Output:
// Print all odd numbers in a single line separated by space, in ascending (increasing) order.

// Constraints
// 1≤L<R≤106
// Sample Input 1:
// 2 9
// Sample Output 1:
// 3 5 7 9
// Sample Input 2:
// 3 4
// Sample Output 2:
// 3
// EXPLANATION:
// In the first example, odd numbers between 2 and 9 are 3,5,7,9.
// In the second example, the only odd number in the range is 3
_______________________________________________________________________________________________________________________________________________________
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
	           //int t=sc.nextInt();
	           //while((t--)!=0)
	           //  {
	            
	            
	
	           //  }
	           int l=sc.nextInt();
	           int r=sc.nextInt();
	           for(int i=l;i<=r;i++){
	               if(i%2==1) System.out.print(i+" ");
	           }
	        
        	} 
        catch(Exception e) 	{ return; }
        
	}
}
