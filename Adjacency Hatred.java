// An array is called lovely if the sum of absolute differences of each adjacent pair of elements is odd; formally, the array S of size m is lovely if ∑m−1i=1 |Si−Si+1| is odd.

// You are given an array A of N integers. You need to reorder the array in any manner such that the array becomes lovely. 
//   If there is no reordering operation that makes the array lovely, output -1.

// Input Format
// The first line contains an integer T denoting the number of test cases. The T test cases then follow.
// The first line of each test case contains an integer N.
// The second line of each test case contains N space-separated integers A1,A2,…,AN.
// Output Format
// For each test case, print a single line containing N integers denoting the modified array which is lovely, or -1 if it is not possible.

// Constraints
// 1≤T≤1000
// 2≤N≤500
// 1≤Ai≤106
// Sample Input 1 
// 2
// 6
// 3 7 10 1 2 12
// 2
// 1 3
// Sample Output 1 
// 1 2 3 10 7 12
// -1
// Explanation
// For the first test case, the sum is |1−2|+|2−3|+|3−10|+|10−7|+|7−12|=1+1+7+3+5=17 which is odd.

// For the second test case, |1−3|=2 which is even. There is no array that can satisfy the above condition.
________________________________________________________________________________________________________________________________________-
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
	               int[] ar=new int[n];
	               ArrayList<Integer> even_list=new ArrayList<>();
	               ArrayList<Integer> odd_list=new ArrayList<>();
	               for(int i=0;i<n;i++){
	                   ar[i]=sc.nextInt();
	                   if(ar[i]%2==0) even_list.add(ar[i]);
	                   else odd_list.add(ar[i]);
	               }
	            if(even_list.isEmpty() || odd_list.isEmpty()) System.out.println("-1");
	            else{
	                for(int i:even_list) System.out.print(i+" ");
	                for(int i:odd_list) System.out.print(i+" ");
	            }
	 System.out.println();
	             }
	        
        	} 
        catch(Exception e) 	{ return; }
        
	}
}
