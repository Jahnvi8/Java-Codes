// You are given a string s. You need to find two non-empty strings a and b such that the following conditions are satisfied:

// Strings a and b are both subsequences of s.
// For each index i, character si of string s must belong to exactly one of strings a or b.
// String a is lexicographically minimum possible; string b may be any possible string.
// Given string s, print any valid a and b.

// Reminder:

// A string a (b) is a subsequence of a string s if a (b) can be obtained from s by deletion of several (possibly, zero) elements. 
//   For example, "dores", "cf", and "for" are subsequences of "codeforces", while "decor" and "fork" are not.

// A string x is lexicographically smaller than a string y if and only if one of the following holds:

// x is a prefix of y, but x≠y;
// in the first position where x and y differ, the string x has a letter that appears earlier in the alphabet than the corresponding letter in y.
// Input
// Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤1000). Description of the test cases follows.

// The first and only line of each test case contains one string s (2≤|s|≤100 where |s| means the length of s). String s consists of lowercase Latin letters.

// Output
// For each test case, print the strings a and b that satisfy the given conditions. If there are multiple answers, print any.

// Example
// inputCopy
// 3
// fc
// aaaa
// thebrightboiler
// outputCopy
// c f
// a aaa
// b therightboiler
// Note
// In the first test case, there are only two choices: either a= f and b= c or a= c and b= f. And a=c is lexicographically smaller than a= f.

// In the second test case, a is the only character in the string.

// In the third test case, it can be proven that b is the lexicographically smallest subsequence of s. The second string can be of two variants; one of them is given here.
_______________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{ 
  
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
	           
	            int t=sc.nextInt();
	           
	            while(t-->0){
	             String s=sc.next();
	             char ch=s.charAt(0);int k=0;
	             for(int i=1;i<s.length();i++)
	             {
	                 if(s.charAt(i)<ch) ch=s.charAt(i);
	             }
	          System.out.print(ch+" ");
	          for(int i=0;i<s.length();i++){
	              if(s.charAt(i)==ch && k==0) {
	                  k++;
	                  continue;
	              }
	              else System.out.print(s.charAt(i));
	          }
	          System.out.println();
	        }
	    }
        catch(Exception e) 	{ return; }
	}
}

