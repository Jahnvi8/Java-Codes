// You are given a string s of length n consisting of characters a and/or b.

// Let AB(s) be the number of occurrences of string ab in s as a substring. Analogically, BA(s) is the number of occurrences of ba in s as a substring.

// In one step, you can choose any index i and replace si with character a or b.

// What is the minimum number of steps you need to make to achieve AB(s)=BA(s)?

// Reminder:

// The number of occurrences of string d in s as substring is the number of indices i (1≤i≤|s|−|d|+1) such that substring sisi+1…si+|d|−1 is equal to d. 
//   For example, AB(aabbbabaa)=2 since there are two indices i: i=2 where aabbbabaa and i=6 where aabbbabaa.

// Input
// Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤1000). Description of the test cases follows.

// The first and only line of each test case contains a single string s (1≤|s|≤100, where |s| is the length of the string s), consisting only of characters a and/or b.

// Output
// For each test case, print the resulting string s with AB(s)=BA(s) you'll get making the minimum number of steps.

// If there are multiple answers, print any of them.

// Example
// inputCopy
// 4
// b
// aabbbabaa
// abbb
// abbaab
// outputCopy
// b
// aabbbabaa
// bbbb
// abbaaa
// Note
// In the first test case, both AB(s)=0 and BA(s)=0 (there are no occurrences of ab (ba) in b), so can leave s untouched.

// In the second test case, AB(s)=2 and BA(s)=2, so you can leave s untouched.

// In the third test case, AB(s)=1 and BA(s)=0. For example, we can change s1 to b and make both values zero.

// In the fourth test case, AB(s)=2 and BA(s)=1. For example, we can change s6 to a and make both values equal to 1.


____________________________________________________________________________________________________________________________________________________
 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	            int t=sc.nextInt();
	            while(t-->0){
	               String s=sc.next();
	                StringBuilder str = new StringBuilder(s);
	                str.append("");
	               if(str.charAt(0)==str.charAt(str.length()-1))
                   System.out.println(str);
                    else{
                         if(str.charAt(0)=='a') str.setCharAt(0,'b');
                         else str.setCharAt(0,'a');
                         System.out.println(str);  
   
                    }
	            }
        	}
        catch(Exception e) 	{ return; }
	}
}
