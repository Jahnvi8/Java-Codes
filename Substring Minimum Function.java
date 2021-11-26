// It's your birthday today! So, you ask your dad to buy a brand new bicycle. But your dad knows you are weak in math. Hence he gives you the following task.
//   If you solve it, he will purchase the bicycle you want! The task is:

// You are given a binary string. N denotes the length of a binary string and M denotes the number of occurrences of the character 1 in the string S.

// Let F(S) be a function that gives the number of different substrings of string S, made up of the character 0 only. Let Subl,r denote the substring of S starting from lth index and terminating at rth index.
//   Two substrings Subp,q and Subr,s are considered same if p=r and q=s otherwise the two substrings are considered different.

// Among all possible strings S of length N having exactly M occurrences of the character 1, print the minimum possible value of F(S).

// Input Format
// First line of input contains a single integer T, denoting the number of test cases. Then the description of the T test case follows.
// Each test case contains one line of input.
// The first line contains two integers N and M.
// Output Format
// For each test case, output a single line answer containing an integer.

// Constraints
// 1≤T≤2⋅105
// 1≤N≤106
// 0≤M≤N
// Sample Input 1 
// 2
// 3 1
// 7 2
// Sample Output 1 
// 2
// 7
// Explanation
// In the first test case, there exists only 3 binary strings of length N, having exactly M occurrences of the character 1.

// For S=100 value of F(S)=3
// For S=001 value of F(S)=3
// For S=010 value of F(S)=2
// So for string S=010 we get a minimum value of F(S)=2.
____________________________________________________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long n=sc.nextLong(),k=sc.nextLong();
		    long z=n-k;
		    long p=k+1;
		    long c=z/p;
		    long l=z%p;
		     long ans=(((c+1)*(c+2))/2)*l +(((c)*(c+1))/2)*(p-l);
		     System.out.println(ans);
		}
		}
		catch(Exception e){return;}
	}
}
