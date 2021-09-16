// Chef is given two integers N,S.

// Consider an array A of size N such that A[i]=i for every 1≤i≤N.

// You are required to find any position x(1≤x≤N) such that :

// (A[1]+A[2]+...A[x−1])+(A[x+1]+A[x+2]+...A[N])=S
// If there are multiple such positions x, print any such position. If there is no such position, print −1.

// Input Format
// First line will contain T, number of testcases. Then the testcases follow.
// Each testcase contains of a single line of input, two integers N,S.
// Output Format
// For each testcase, output the required position or −1 in case there is no such position.

// Constraints
// 1≤T≤1000
// 2≤N≤109
// 1≤S≤1018
// Sample Input 1 
// 3
// 4 8
// 5 10
// 2 3
// Sample Output 1 
// 2
// 5
// -1
// Explanation
// Test Case 1: A[1]+A[3]+A[4]=1+3+4=8, so x=2 is a suitable position.

// Test Case 3: There is no suitable position.
________________________________________________________________________________________________________________________________
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
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0){
		    long num=sc.nextLong();
		    long sum=sc.nextLong();
		    long total_sum=(num*(num+1))/2;
		    long start=1;
		    long end=num;
		    int flag=0;
		    while(start<=end){
		        long mid=start+(end-start)/2;
		        long l=(mid*(mid-1))/2;
                long r=total_sum-l-mid;
                
                 if(l+r==sum)
        {
            flag++;
            System.out.println(mid);
            break;
        }
        else if(l+r>sum)
        start=mid+1;
        else
        end=mid-1;
		    }
		    if(flag==0)
    System.out.println("-1");
		}
	}
}
