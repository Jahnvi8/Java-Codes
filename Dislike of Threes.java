// Polycarp doesn't like integers that are divisible by 3 or end with the digit 3 in their decimal representation. Integers that meet both conditions are disliked by Polycarp, too.

// Polycarp starts to write out the positive (greater than 0) integers which he likes: 1,2,4,5,7,8,10,11,14,16,…. Output the k-th element of this sequence (the elements are numbered from 1).

// Input
// The first line contains one integer t (1≤t≤100) — the number of test cases. Then t test cases follow.

// Each test case consists of one line containing one integer k (1≤k≤1000).

// Output
// For each test case, output in a separate line one integer x — the k-th element of the sequence that was written out by Polycarp.

// Example
// inputCopy
// 10
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 1000
// outputCopy
// 1
// 2
// 4
// 5
// 7
// 8
// 10
// 11
// 14
// 1666

________________________________________________________________________________________________________________________________________________________

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);

      int t=sc.nextInt();
       int ar[]=new int[10000];
       int k=1;
     for(int i=1;i<10000;i++)
     {
         if(i%3==0)
         continue;
         else if(i%10==3)
         continue;
         else if(i%3==0 && i%10==3)
         continue;
         else
         ar[k++]=i;
     }
       
      while((t--)!=0){
        int n=sc.nextInt();
        System.out.println(ar[n]);
      }

}
}
