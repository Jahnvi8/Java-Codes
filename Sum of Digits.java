// Having watched the last Harry Potter film, little Gerald also decided to practice magic. He found in his father's magical book a spell that turns any number 
//   in the sum of its digits. At the moment Gerald learned that, he came across a number n. How many times can Gerald put a spell on it until the number becomes one-digit?

// Input
// The first line contains the only integer n (0 ≤ n ≤ 10100000). It is guaranteed that n doesn't contain any leading zeroes.

// Output
// Print the number of times a number can be replaced by the sum of its digits until it only contains one digit.

// Examples
// inputCopy
// 0
// outputCopy
// 0
// inputCopy
// 10
// outputCopy
// 1
// inputCopy
// 991
// outputCopy
// 3
// Note
// In the first sample the number already is one-digit — Herald can't cast a spell.

// The second test contains number 10. After one casting of a spell it becomes 1, and here the process is completed. Thus, Gerald can only cast the spell once.

// The third test contains number 991. As one casts a spell the following transformations take place: 991 → 19 → 10 → 1. After three transformations the number becomes one-digit.

_____________________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
    public static long getsum(String ch)
    {
        long sum=0;
    
        for (int i=0;i<ch.length();i++){
            sum+=ch.charAt(i)-'0';
        }
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int c=0;
		while(str.length()!=1){
		  //  int n=Integer.parseInt(str);  
		   
		    str=String.valueOf(getsum(str));
		    c++;
		}
		System.out.println(c);
	}
}
