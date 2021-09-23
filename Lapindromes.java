// Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character.
//   If there are odd number of characters in the string, we ignore the middle character and check for lapindrome.
//     For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. 
//     Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome.
//     The two halves contain the same characters but their frequencies do not match.
// Your task is simple. Given a string, you need to tell if it is a lapindrome.

// Input:
// First line of input contains a single integer T, the number of test cases.
// Each test is a single line containing a string S composed of only lowercase English alphabet.
// Output:
// For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.
// Constraints:
// 1 ≤ T ≤ 100
// 2 ≤ |S| ≤ 1000, where |S| denotes the length of S
// Example:
// Input:
// 6
// gaga
// abcde
// rotor
// xyzxy
// abbaab
// ababc


// Output:
// YES
// NO
// YES
// YES
// NO
// NO
____________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	            int t = sc.nextInt();
                while(t--!=0)
                 {
                  String S = sc.next();
                  int len = S.length();
                  String half1="",half2="";
                  int c=0;
                   half1=S.substring(0,len/2);
                  if(len%2==0) half2=S.substring(len/2);
                  else if(len%2!=0) half2=S.substring(len/2+1);
                  char h1[] = half1.toCharArray();
                  char h2[] = half2.toCharArray();
                  Arrays.sort(h1);
                  Arrays.sort(h2);
                  String a = String.copyValueOf(h1);
                  String b = String.copyValueOf(h2);
    
            if(a.equals(b)) System.out.println("YES");
            else System.out.println("NO");
        }
        	}
        catch(Exception e) 	{ return; }
	}
}

