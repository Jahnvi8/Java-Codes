// PUBG has introduced a new bounty mode, in this mode every person has a bounty, you can kill any of the players to acquire the bounty on their head and use that money to buy gear. you want to buy a new gun which is k units in price. you have only two bullets left with you, given the bounties of each player find out whether you can kill any two players such that the sum of their bounties is equal to the price of your new gun.

// For example, given bounty list [10, 15, 3, 7] and price of gun 17, return true since 10 + 7 is 17.

// Input Format
// The first line of input contains K, the price of the new gun you want to buy.
// The second line of input contains N, the number of remaining players on the map.
// The N subsequent lines contain bounties of each player on the map.
// Output Format
// Print 'true' if you can buy the gun with two player's bounty, print 'false' otherwise

// Constraints
// 1≤K≤106
// 1≤N≤100
// Sample Input 1 
// 17
// 4
// 10
// 15
// 3
// 7
// Sample Output 1 
// true
______________________________________________________________________________________________________________________________________
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
	       int k=sc.nextInt();
	       int n=sc.nextInt();
	       int[] ar=new int[n];
	       
	       for(int i=0;i<n;i++)
	         ar[i]=sc.nextInt();
	       
	       Arrays.sort(ar);
	       int i=0,j=ar.length-1;
	       int sum=0,flag=0;
	       while(i<j){
	           sum=ar[i]+ar[j];
	           if(sum==k) {
	               flag++;
	               break;
	           }
	           else if(sum>k) j--;
	           else i++;
	       }
	       if(flag==1) System.out.println("true");
	       else System.out.println("false");
	       
	       
	   } catch(Exception e) {
	   }
	}
}
