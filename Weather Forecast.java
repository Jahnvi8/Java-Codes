// Problem Statement
// You are given a string S, which represents a weather forecast for the seven days starting tomorrow.
// The i-th of those seven days is forecast to be sunny if the i-th character of S is o, and rainy if that character is x.

// Tell us whether the N-th day is forecast to be sunny.

// Constraints
// N is an integer between 1 and 7 (inclusive).
// S is a string of length 7 consisting of o and x.
// Input
// Input is given from Standard Input in the following format:

// N
// S
// Output
// Print Yes if the N-th of the seven days starting tomorrow is forecast to be sunny, and No if that day is forecast to be rainy.

// Sample Input 1 
// Copy
// 4
// oooxoox
// Sample Output 1 
// Copy
// No
// The forecast for each of the seven days starting tomorrow is as follows: sunny, sunny, sunny, rainy, sunny, sunny, rainy.
// In particular, the fourth day is forecast to be rainy.

// Sample Input 2 
// Copy
// 7
// ooooooo
// Sample Output 2 
// Copy
// Yes
____________________________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		if(str.charAt(n-1)=='x') System.out.println("No");
		else System.out.println("Yes");
	}
}
