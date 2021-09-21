// You are given one integer number n. Find three distinct integers a,b,c such that 2≤a,b,c and a⋅b⋅c=n or say that it is impossible to do it.

// If there are several answers, you can print any.

// You have to answer t independent test cases.

// Input
// The first line of the input contains one integer t (1≤t≤100) — the number of test cases.

// The next n lines describe test cases. The i-th test case is given on a new line as one integer n (2≤n≤109).

// Output
// For each test case, print the answer on it. Print "NO" if it is impossible to represent n as a⋅b⋅c for some distinct integers a,b,c such that 2≤a,b,c.

// Otherwise, print "YES" and any possible such representation.

// Example
// input
// 5
// 64
// 32
// 97
// 2
// 12345
// output
// YES
// 2 4 8 
// NO
// NO
// NO
// YES
// 3 5 823 
_________________________________________________________________________________________________________________________________________________________
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
	            int t=sc.nextInt();
	            while(t-->0){
	                
	                long n = sc.nextLong();
	                long a=Long.MAX_VALUE;
	                long b=Long.MAX_VALUE;
	                long c=Long.MAX_VALUE;
	                for(int i=2;i*i<=n;i++)
                    {
                       if(n%i==0)
                       {
                         a=i;
                         break;
                       }
                    }
		             n/=a;
		           for(int i=2;i*i<=n;i++)
                   {
                     if(n%i==0)
                      {
                       if(i!=a) {b=i; break;}
                      }
                   }
                   c=(n/b);
                    if((a!=b) && (b!=c) && (c>a && c>b))
                    {
                      System.out.println("YES");
                      System.out.print(a+" "+b+" "+c);
                      System.out.println();
                    }
                    else
                    System.out.println("NO");
        
        
	            }
        	}
        catch(Exception e) 	{ return; }
	}
}
