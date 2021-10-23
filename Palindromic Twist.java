// You are given a string s consisting of n lowercase Latin letters. n is even.

// For each position i (1≤i≤n) in string s you are required to change the letter on this position either to the previous letter in alphabetic order or to the next one 
// (letters 'a' and 'z' have only one of these options). Letter in every position must be changed exactly once.

// For example, letter 'p' should be changed either to 'o' or to 'q', letter 'a' should be changed to 'b' and letter 'z' should be changed to 'y'.

// That way string "codeforces", for example, can be changed to "dpedepqbft" ('c' → 'd', 'o' → 'p', 'd' → 'e', 'e' → 'd', 'f' → 'e', 'o' → 'p', 'r' → 'q', 'c' → 'b', 'e' → 'f',
//                                                                            's' → 't').

// String s is called a palindrome if it reads the same from left to right and from right to left. For example, strings "abba" and "zz" are palindromes and strings "abca" 
  
//   and "zy" are not.

// Your goal is to check if it's possible to make string s a palindrome by applying the aforementioned changes to every position. Print "YES" if string s can be transformed 
//   to a palindrome and "NO" otherwise.

// Each testcase contains several strings, for each of them you are required to solve the problem separately.

// Input
// The first line contains a single integer T (1≤T≤50) — the number of strings in a testcase.

// Then 2T lines follow — lines (2i−1) and 2i of them describe the i-th string. The first line of the pair contains a single integer n (2≤n≤100, n is even) —
// the length of the corresponding string.
//   The second line of the pair contains a string s, consisting of n lowercase Latin letters.

// Output
// Print T lines. The i-th line should contain the answer to the i-th string of the input. Print "YES" if it's possible to make the i-th string a palindrome by applying
//   the aforementioned changes to every position. Print "NO" otherwise.

// Example
// inputCopy
// 5
// 6
// abccba
// 2
// cf
// 4
// adfa
// 8
// abaazaba
// 2
// ml
// outputCopy
// YES
// NO
// YES
// NO
// NO
// Note
// The first string of the example can be changed to "bcbbcb", two leftmost letters and two rightmost letters got changed to the next letters,
// two middle letters got changed to the previous letters.

// The second string can be changed to "be", "bg", "de", "dg", but none of these resulting strings are palindromes.

// The third string can be changed to "beeb" which is a palindrome.

// The fifth string can be changed to "lk", "lm", "nk", "nm", but none of these resulting strings are palindromes. Also note that no letter can remain the same, 
// so you can't obtain strings "ll" or "mm".
_____________________________________________________________________________________________________________________________________________________
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
	              int n=sc.nextInt();
	              char ar[]=sc.next().toCharArray();
	              int i=0,j=n-1;
	              boolean flag=true;
	              while(i<j){
                        if(ar[i]!=ar[j]){
                         if(Math.abs(ar[i]-ar[j])!=2){
                             flag=false;
                             
                             break;
                         }
                         
	                  }
	                  i++;j--;
                
	              }
	              
	          
	              if(flag) System.out.println("YES");
	              else System.out.println("NO");
	              
	           }
	        }
        catch(Exception e) 	{ return; }
	}
}

