// Once Bob got to a sale of old TV sets. There were n TV sets at that sale. TV set with index i costs ai bellars. 
//   Some TV sets have a negative price — their owners are ready to pay Bob if he buys their useless apparatus. Bob can «buy» any TV sets he wants. 
//     Though he's very strong, Bob can carry at most m TV sets, and he has no desire to go to the sale for the second time.
//     Please, help Bob find out the maximum sum of money that he can earn.

// Input
// The first line contains two space-separated integers n and m (1 ≤ m ≤ n ≤ 100) — amount of TV sets at the sale, and amount of TV sets that Bob can carry. 
//   The following line contains n space-separated integers ai ( - 1000 ≤ ai ≤ 1000) — prices of the TV sets.

// Output
// Output the only number — the maximum sum of money that Bob can earn, given that he can carry at most m TV sets.

// Examples
// inputCopy
// 5 3
// -6 0 35 -2 4
// outputCopy
// 8
// inputCopy
// 4 2
// 7 0 0 -7
// outputCopy
// 7
___________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	           int n=sc.nextInt();
	             int m=sc.nextInt();
	             int k=0,sum=0;
	             PriorityQueue<Integer> pq=new PriorityQueue<>();
	             
	             for(int i=0;i<n;i++){
	                pq.add(sc.nextInt());
	             }
	             while(!pq.isEmpty() && k<m){
	                 if(pq.peek()>0) break;
	                  sum+=Math.abs(pq.poll());
	                 k++;
	                 
	             }
	                 
	             
	          System.out.println(sum);
	        
        	} 
        catch(Exception e) 	{ return; }
        
	}
}
