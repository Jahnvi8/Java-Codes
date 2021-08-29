// You are given a sequence of integers A1,A2,…,AN and an integer K. Find the number of contiguous subsequences AL,AL+1,…,AR such that R−L+1≥K and the K-th element of the subsequence (AL+K−1) is equal to the maximum of all elements of the entire sequence.

// Input Format
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains two space-separated integers N and K.
// The second line contains N space-separated integers A1,A2,…,AN.
// Output Format
// For each test case, print a single line containing one integer --- the number of contiguous subsequences satisfying the given conditions.

// Constraints
// 1≤T≤200
// 1≤K≤N≤2⋅105
// |Ai|≤105 for each valid i
// the sum of N over all test cases does not exceed 5⋅105
// Subtasks
// Subtask #1 (10 points)

// T≤10
// N≤100
// Subtask #2 (90 points) original constraints

// Sample Input 1 
// 1
// 5 3
// 1 2 3 4 5
// Sample Output 1 
// 1
// Explanation
// Example case 1: (3,4,5) is the only contiguous subsequence such that its 3-rd element is equal to the maximum of the whole sequence (which is 5).
____________________________________________________________________________________________________________________________________________________________
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
	           int t=sc.nextInt();
	           while((t--)!=0)
	             {
	            
	             int n=sc.nextInt();
	                 int k=sc.nextInt();
	                 int[] ar=new int[n];
	                 
	                 int maxval=Integer.MIN_VALUE;
	                 for(int i=0;i<n;i++)
	                    { ar[i]=sc.nextInt();
	                      maxval=Math.max(maxval,ar[i]);
	                    }
	                 
                   
                    int pos=0;long ans=0;
                    for( int j=0;j<n;j++){
                       pos=j+k-1;
                       if(pos<n && ar[pos]==maxval)
                       ans+=(n-pos);
                    }
                   System.out.println(ans);
	
	             }
	        
        	} 
        catch(Exception e) 	{ return; }
        
	}
}
