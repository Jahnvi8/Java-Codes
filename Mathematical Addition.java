// Ivan decided to prepare for the test on solving integer equations. He noticed that all tasks in the test have the following form:

// You are given two positive integers u and v, find any pair of integers (not necessarily positive) x, y, such that:
// xu+yv=x+yu+v.
// The solution x=0, y=0 is forbidden, so you should find any solution with (x,y)≠(0,0).
// Please help Ivan to solve some equations of this form.

// Input
// The first line contains a single integer t (1≤t≤103) — the number of test cases. The next lines contain descriptions of test cases.

// The only line of each test case contains two integers u and v (1≤u,v≤109) — the parameters of the equation.

// Output
// For each test case print two integers x, y — a possible solution to the equation. It should be satisfied that −1018≤x,y≤1018 and (x,y)≠(0,0).

// We can show that an answer always exists. If there are multiple possible solutions you can print any.

// Example
// inputCopy
// 4
// 1 1
// 2 3
// 3 5
// 6 9
// outputCopy
// -1 1
// -4 9
// -18 50
// -4 9
// Note
// In the first test case: −11+11=0=−1+11+1.

// In the second test case: −42+93=1=−4+92+3.

// In the third test case: −183+505=4=−18+503+5.

// In the fourth test case: −46+99=13=−4+96+9.


// ________________________________________________________________________________________________________________________________________________
 import java.util.*;
// import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0){
	          long u=sc.nextLong(),v=sc.nextLong();
	          long x=u*u,y=v*v;
	          System.out.println("-"+x+" "+y);
	          
	        } 
        	}
        catch(Exception e) 	{ return; }
	}
}
