// Chef aims to be the richest person in Chefland by his new restaurant franchise. Currently, his assets are worth A billion dollars and have no liabilities. 
//He aims to increase his assets by X billion dollars per year.

// Also, all the richest people in Chefland are not planning to grow and maintain their current worth.

// To be the richest person in Chefland, he needs to be worth at least B billion dollars.
//How many years will it take Chef to reach his goal if his value increases by X billion dollars each year?

// Input
// The first line contains an integer T, the number of test cases. Then the test cases follow.
// Each test case contains a single line of input, three integers A, B, X.
// Output
// For each test case, output in a single line the answer to the problem.

// Constraints
// 1≤T≤21 000
// 100≤A<B≤200
// 1≤X≤50
// X divides B−A
// Subtasks
// Subtask #1 (100 points): Original constraints

// Sample Input
// 3
// 100 200 10
// 111 199 11
// 190 200 10
// Sample Output
// 10
// 8
// 1
// Explanation
// Test Case 1: Chef needs to increase his worth by 200−100=100 billion dollars and his increment per year being 10 billion dollars, so it will take him 10010=10 years to do so.

// Test Case 2: Chef needs to increase his worth by 199−111=88 billion dollars and his increment per year being 11 billion dollars, so it will take him 8811=8 years to do so.

// Test Case 3: Chef needs to increase his worth by 200−190=10 billion dollars and his increment per year being 10 billion dollars, so it will take him 1010=1 year to do so.
__________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0){
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int x=sc.nextInt();
	    int ans=(b-a)/x;
	    System.out.println(ans);
	    
	    t--;
	}
	}
}
