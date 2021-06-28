// If Give an integer N . Write a program to obtain the sum of the first and last digits of this number.

// Input
// The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains an integer N.

// Output
// For each test case, display the sum of first and last digits of N in a new line.

// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ N ≤ 1000000

// Example
// Input
// 3 
// 1234
// 124894
// 242323

// Output
// 5
// 5
// 5
___________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

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
	    int test=sc.nextInt();
	    while(test--!=0)
	    {
	        int n=sc.nextInt();
	       List<Integer> all=new ArrayList<>();
	       while(n>0)
	       {
	           int rem=n%10;
	           n=n/10;
	           all.add(rem);
	       }

	        int sum=all.get(0)+all.get(all.size()-1);
	        System.out.println(sum);
	    }
	} catch(Exception e) { return;
	}
	}
}

