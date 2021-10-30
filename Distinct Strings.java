// Problem Statement
// You are given a string S of length 3 consisting of lowercase English letters.

// How many different strings can be obtained by permuting the characters in S?

// Constraints
// S is a string S of length 3 consisting of lowercase English letters.
// Input
// Input is given from Standard Input in the following format:

// S
// Output
// Print the number of different strings that can be obtained by permuting the characters in S.

// Sample Input 1 
// Copy
// aba
// Sample Output 1 
// Copy
// 3
// By permuting the characters in S= aba, three different strings can be obtained: aab, aba, baa.

// Sample Input 2 
// Copy
// ccc
// Sample Output 2 
// Copy
// 1
// By permuting the characters in S= ccc, just one string can be obtained: ccc.

// Sample Input 3 
// Copy
// xyz
// Sample Output 3 
// Copy
// 6
// By permuting the characters in S= xyz, six different strings can be obtained: xyz, xzy, yxz, yzx, zxy, zyx.
_____________________________________________________________________________________________________________________________________________________
import java.util.*;

public class Main
{  static int c=0;
   static void printDistinctPermutn(String str,	String ans)
	{
		if (str.length() == 0) {
			c++;
		   return;
		}
		boolean alpha[] = new boolean[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			if (alpha[ch - 'a'] == false)
				printDistinctPermutn(ros, ans + ch);
			alpha[ch - 'a'] = true;
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
               String str=sc.next();
	        printDistinctPermutn(str, "");
	        System.out.println(c);
	    }
        catch(Exception e) 	{ return; }
	}
}

