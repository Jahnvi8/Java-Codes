// You are given a multiset S initially consisting of n distinct non-negative integers. A multiset is a set, that can contain some elements multiple times.

// You will perform the following operation k times:

// Add the element ⌈a+b2⌉ (rounded up) into S, where a=mex(S) and b=max(S). If this number is already in the set, it is added again.
// Here max of a multiset denotes the maximum integer in the multiset, and mex of a multiset denotes the smallest non-negative integer that is not present in the multiset.
// For example:

// mex({1,4,0,2})=3;
// mex({2,5,1})=0.
// Your task is to calculate the number of distinct elements in S after k operations will be done.

// Input
// The input consists of multiple test cases. The first line contains a single integer t (1≤t≤100) — the number of test cases. The description of the test cases follows.

// The first line of each test case contains two integers n, k (1≤n≤105, 0≤k≤109) — the initial size of the multiset S and how many operations you need to perform.

// The second line of each test case contains n distinct integers a1,a2,…,an (0≤ai≤109) — the numbers in the initial multiset.

// It is guaranteed that the sum of n over all test cases does not exceed 105.

// Output
// For each test case, print the number of distinct elements in S after k operations will be done.

// Example
// inputCopy
// 5
// 4 1
// 0 1 3 4
// 3 1
// 0 1 4
// 3 0
// 0 1 4
// 3 2
// 0 1 2
// 3 2
// 1 2 3
// outputCopy
// 4
// 4
// 3
// 5
// 3
// Note
// In the first test case, S={0,1,3,4}, a=mex(S)=2, b=max(S)=4, ⌈a+b2⌉=3. So 3 is added into S, and S becomes {0,1,3,3,4}. The answer is 4.

// In the second test case, S={0,1,4}, a=mex(S)=2, b=max(S)=4, ⌈a+b2⌉=3. So 3 is added into S, and S becomes {0,1,3,4}. The answer is 4.
________________________________________________________________________________________________________________________________________________________________
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
	                long n=sc.nextLong();
	                long k=sc.nextLong();
	                Set<Integer> al=new HashSet<>();
	                for(int i=0;i<n;i++)
	                al.add(sc.nextInt());
	               
	                
	                if(k==0) System.out.println(n);
	               // -------------------------------------------
	               else{ 
	                   long mex=0;
	                for(int i=0;i<=100000;i++){
	                    if(!al.contains(i)) {
	                        mex=i;
	                      
	                        break;
	                    }
	                }
	                long max=Collections.max(al);
	               
	                int ope=(int)Math.ceil((mex+max)/2.0);
	               
	                if(mex>max) System.out.println(n+k);
	               // --------------------------------------
	                else if(al.contains(ope)) System.out.println(n);
	                else System.out.println(n+1);
	               }
	            }
        	} 
        catch(Exception e) 	{ return; }
        
	}
}
