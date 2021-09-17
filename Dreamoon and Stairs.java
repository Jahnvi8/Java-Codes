// Dreamoon wants to climb up a stair of n steps. He can climb 1 or 2 steps at each move. Dreamoon wants the number of moves to be a multiple of an integer m.

// What is the minimal number of moves making him climb to the top of the stairs that satisfies his condition?

// Input
// The single line contains two space separated integers n, m (0 < n ≤ 10000, 1 < m ≤ 10).

// Output
// Print a single integer — the minimal number of moves being a multiple of m. If there is no way he can climb satisfying condition print  - 1 instead.

// Examples
// inputCopy
// 10 2
// outputCopy
// 6
// inputCopy
// 3 5
// outputCopy
// -1
// Note
// For the first sample, Dreamoon could climb in 6 moves with following sequence of steps: {2, 2, 2, 2, 1, 1}.

// For the second sample, there are only three valid sequence of steps {2, 1}, {1, 2}, {1, 1, 1} with 2, 2, and 3 steps respectively. All these numbers are not multiples of 5.
_____________________________________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	         
	              
	               int n=sc.nextInt();
	               int k=sc.nextInt();
	               if(n==2 && k==2) System.out.println("2");
	               else if(n<k) System.out.println("-1");
	               else if(n==k){
	                   
	                   if(n%2==0 && k%2==0) System.out.println(n/2);
	                   else System.out.println(n);
 	               }
 	               else{
 	                   int val=(int)Math.ceil(n/2.0);
 	                   int f=0;
 	                   while(val%k!=0){
 	                       
 	                       val++;
 	                       if(val>n) {
 	                           f++;
 	                           break;
 	                       }
 	                   }
 	                  if(f==0) System.out.println(val);
 	                  else System.out.println("-1");
 	               }
	               
	            
        	}
        catch(Exception e) 	{ return; }
        
	}
}
