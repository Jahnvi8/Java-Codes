// There are three people, and each of them has an unbiased 6-sided die. The result of rolling a die will be a number between 1 and 6 (inclusive) with equal probability.

// The three people throw their dice simultaneously. In this game, the third person wins only if his number is strictly greater than the sum of the other two numbers. Given that the first person rolls the value X and the second person rolls the value Y, what is the probability the third person will win?

// Input Format
// The first line contains an integer T, the number of test cases. Then the test cases follow.
// Each test case contains two integers X and Y.
// Output Format
// For each test case, output the probability that the third person wins.

// Your answer will be considered correct if its absolute error doesn't exceed 10−6.

// Constraints
// 1≤T≤36
// 1≤X,Y≤6

// Sample Input 1 
// 3
// 1 3
// 2 4
// 2 3
// Sample Output 1 
// 0.333333
// 0
// 0.166666
  
// Explanation
// In the first test case, out of the six outcomes of a die, the third person wins if the result is either 5 or 6. So the probability of winning is 26≈0.333333.
// In the second test case, the third person only wins if the result is greater than 6, which is impossible. So the probability of winning is 0.
____________________________________________________________________________________________________________________________
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
	          int x=sc.nextInt();
	          int y=sc.nextInt();
	          int sum=x+y;
	        
	        if(sum>=6) System.out.println("0");
	        
	        if(sum==2) {
	            double ans=4/6.0;
	             System.out.println(String.format("%.6f", ans));
	        }
	         if(sum==3) {
	            double ans=3/6.0;
	             System.out.println(String.format("%.6f", ans));
	        }
	         if(sum==4) {
	            double ans=2/6.0;
	             System.out.println(String.format("%.6f", ans));
	        }
	         if(sum==5) {
	            double ans=1/6.0;
	             System.out.println(String.format("%.6f", ans));
	        }
	          t--;
	      }
	      
	      
	  } catch(Exception e) {
	  }
	}
}
