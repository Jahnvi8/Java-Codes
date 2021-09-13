// You are given two positive integers n and s. Find the maximum possible median of an array of n non-negative integers (not necessarily distinct), 
// such that the sum of its elements is equal to s.

// A median of an array of integers of length m is the number standing on the ⌈m2⌉-th (rounding up) position in the non-decreasing ordering of its elements.
//   Positions are numbered starting from 1. For example, a median of the array [20,40,20,50,50,30] is the ⌈m2⌉-th element of [20,20,30,40,50,50], so it is 30. 
//   There exist other definitions of the median, but in this problem we use the described definition.

// Input
// The input consists of multiple test cases. The first line contains a single integer t (1≤t≤104) — the number of test cases. Description of the test cases follows.

// Each test case contains a single line with two integers n and s (1≤n,s≤109) — the length of the array and the required sum of the elements.

// Output
// For each test case print a single integer — the maximum possible median.

// Example
// inputCopy
// 8
// 1 5
// 2 5
// 3 5
// 2 1
// 7 17
// 4 14
// 1 1000000000
// 1000000000 1
// outputCopy
// 5
// 2
// 2
// 0
// 4
// 4
// 1000000000
// 0
// Note
// Possible arrays for the first three test cases (in each array the median is underlined):

// In the first test case [5–]
// In the second test case [2–,3]
// In the third test case [1,2–,2]

____________________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long n=sc.nextLong();
		    long sum=sc.nextLong();
		    if(n==1) System.out.println(sum);
		    else if(sum==1) System.out.println("0");
		    else if(n==2) System.out.println(sum/2);
		    else{
		        int pos=(int)Math.ceil(n/2.0);
		        long x=n-pos+1;
		        long m=sum/x;
		        System.out.println(m);
		    }
		}
	}
}
