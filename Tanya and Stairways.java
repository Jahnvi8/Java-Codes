// Little girl Tanya climbs the stairs inside a multi-storey building. Every time Tanya climbs a stairway, she starts counting steps from 1 to the number of steps in this stairway. 
//   She speaks every number aloud. For example, if she climbs two stairways, the first of which contains 3 steps, and the second contains 4 steps, 
// she will pronounce the numbers 1,2,3,1,2,3,4.

// You are given all the numbers pronounced by Tanya. How many stairways did she climb? Also, output the number of steps in each stairway.

// The given sequence will be a valid sequence that Tanya could have pronounced when climbing one or more stairways.

// Input
// The first line contains n (1≤n≤1000) — the total number of numbers pronounced by Tanya.

// The second line contains integers a1,a2,…,an (1≤ai≤1000) — all the numbers Tanya pronounced while climbing the stairs, in order from the first to the last pronounced number.
//   Passing a stairway with x steps, she will pronounce the numbers 1,2,…,x in that order.

// The given sequence will be a valid sequence that Tanya could have pronounced when climbing one or more stairways.

// Output
// In the first line, output t — the number of stairways that Tanya climbed. In the second line, output t numbers — the number of steps in each stairway she climbed.
//   Write the numbers in the correct order of passage of the stairways.

// Examples
// inputCopy
// 7
// 1 2 3 1 2 3 4
// outputCopy
// 2
// 3 4 
// inputCopy
// 4
// 1 1 1 1
// outputCopy
// 4
// 1 1 1 1 
// inputCopy
// 5
// 1 2 3 4 5
// outputCopy
// 1
// 5 
// inputCopy
// 5
// 1 2 1 2 1
// outputCopy
// 3
// 2 2 1 
____________________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
   
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scc=new Scanner(System.in);
		int n=scc.nextInt();
	ArrayList<Integer> al=new ArrayList<>();
	    int sc=0,step=1;
		for (int i=0;i<n ;i++ )
   
    {
    	    if(scc.nextInt()==1) {
    	        sc++;
    	        al.add(step);
    	        step=1;
    	    }
    	    else 
    	    step++;
	
    	}
    	System.out.println(sc);
    	for(int i=1;i<al.size();i++)
    	System.out.print(al.get(i)+" ");
    	System.out.print(step);
	}
}
