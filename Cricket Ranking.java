// In a season, each player has three statistics: runs, wickets, and catches. Given the season stats of two players A and B, denoted by R, W, and C respectively, the person who is better than the other in the most statistics is regarded as the better overall player. Tell who is better amongst A and B. It is known that in each statistic, the players have different values.

// Input Format
// The first line contains an integer T, the number of test cases. Then the test cases follow.
// Each test case contains two lines of input.
// The first line contains three integers R1, W1, C1, the stats for player A.
// The second line contains three integers R2, W2, C2, the stats for player B.
// Output Format
// For each test case, output in a single line "A" (without quotes) if player A is better than player B and "B" (without quotes) otherwise.

// Constraints
// 1≤T≤1000
// 0≤R1,R2≤500
// 0≤W1,W2≤20
// 0≤C1,C2≤20
// R1≠R2
// W1≠W2
// C1≠C2
// Sample Input 1 
// 3
// 0 1 2
// 2 3 4
// 10 10 10
// 8 8 8
// 10 0 10
// 0 10 0
// Sample Output 1 
// B
// A
// A
// Explanation
// Test Case 1: Player B is better than A in all 3 fields.

// Test Case 2: Player A is better than B in all 3 fields.

// Test Case 3: Player A is better than B in runs scored and number of catches.
_______________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t!=0){
		         int r1=sc.nextInt();
		         int w1=sc.nextInt();
		         int c1=sc.nextInt();
		         
		         int r2=sc.nextInt();
		         int w2=sc.nextInt();
		         int c2=sc.nextInt();
		         
		         int acount=0,bcount=0;
		         
		      if(r1>r2) acount++;
		      else bcount++;
		      
		      if(w1>w2) acount++;
		      else bcount++;
		      
		      if(c1>c2) acount++;
		      else bcount++;
		          
		          if(acount>bcount) System.out.println("A");
		          else System.out.println("B");
		        
		        t--;
		    }
 
		} catch(Exception e) {
		}
}}
