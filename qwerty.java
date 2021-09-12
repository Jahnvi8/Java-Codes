// Problem Statement
// You are given a sequence of 26 integers P=(P 
// 1
// ​
//  ,P 
// 2
// ​
//  ,…,P 
// 26
// ​
//  ) consisting of integers from 1 through 26. It is guaranteed that all elements in P are distinct.

// Print a string S of length 26 that satisfies the following condition.

// For every i (1≤i≤26), the i-th character of S is the lowercase English letter that comes P 
// i
// ​
//  -th in alphabetical order.
// Constraints
// 1≤P 
// i
// ​
//  ≤26
// P 
// i
// ​
 
// 
// =P 
// j
// ​
//   (i
// 
// =j)
// All values in input are integers.
// Input
// Input is given from Standard Input in the following format:

// P 
// 1
// ​
//   P 
// 2
// ​
//   … P 
// 26
// ​
 
// Output
// Print the string S.

// Sample Input 1 
// Copy
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
// Sample Output 1 
// Copy
// abcdefghijklmnopqrstuvwxyz
// Sample Input 2 
// Copy
// 2 1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
// Sample Output 2 
// Copy
// bacdefghijklmnopqrstuvwxyz
// Sample Input 3 
// Copy
// 5 11 12 16 25 17 18 1 7 10 4 23 20 3 2 24 26 19 14 9 6 22 8 13 15 21
// Sample Output 3 
// Copy
// eklpyqragjdwtcbxzsnifvhmou
__________________________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
     	char[] ar = "0abcdefghijklmnopqrstuvwxyz".toCharArray();
        while(sc.hasNext()){
	    System.out.print(ar[sc.nextInt()]);
	}
	}
}
