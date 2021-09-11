// Alice gave Bob two integers a and b (a>0 and b≥0). Being a curious boy, Bob wrote down an array of non-negative integers with MEX value of all elements equal to a
// and XOR value of all elements equal to b.

// What is the shortest possible length of the array Bob wrote?

// Recall that the MEX (Minimum EXcluded) of an array is the minimum non-negative integer that does not belong to the array and the XOR of an array is the bitwise XOR of
// all the elements of the array.

// Input
// The input consists of multiple test cases. The first line contains an integer t (1≤t≤5⋅104) — the number of test cases. The description of the test cases follows.

// The only line of each test case contains two integers a and b (1≤a≤3⋅105; 0≤b≤3⋅105) — the MEX and XOR of the array, respectively.

// Output
// For each test case, output one (positive) integer — the length of the shortest array with MEX a and XOR b. We can show that such an array always exists.

// Example
// inputCopy
// 5
// 1 1
// 2 1
// 2 0
// 1 10000
// 2 10000
// outputCopy
// 3
// 2
// 3
// 2
// 3
// Note
// In the first test case, one of the shortest arrays with MEX 1 and XOR 1 is [0,2020,2021].

// In the second test case, one of the shortest arrays with MEX 2 and XOR 1 is [0,1].

// It can be shown that these arrays are the shortest arrays possible.
___________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
   public static int comp(int a){
       if(a%4==0) return a;
       if(a%4==1) return 1;
       if(a%4==2) return a+1;
       return 0;
   }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int ans=comp(a-1);
		    if(a==1 && b==1) System.out.println("3");
		    else if(ans==b) System.out.println(a);
		    else if((ans^b)==a)  System.out.println(a+2);
		    else System.out.println(a+1);
		}
	}
}
