/*   Luntik has decided to try singing. He has a one-minute songs, b two-minute songs and c three-minute songs. He wants to distribute all songs into two concerts
such that every song should be included to exactly one concert.

He wants to make the absolute difference of durations of the concerts as small as possible. The duration of the concert is the sum of durations of all songs in that concert.

Please help Luntik and find the minimal possible difference in minutes between the concerts durations.

Input
The first line contains a single integer t (1≤t≤1000) — the number of test cases.

Each test case consists of one line containing three integers a,b,c (1≤a,b,c≤109) — the number of one-minute, two-minute and three-minute songs.

Output
For each test case print the minimal possible difference in minutes between the concerts durations.

Example
inputCopy
4
1 1 1
2 1 3
5 5 5
1 1 2
outputCopy
0
1
0
1
Note
In the first test case, Luntik can include a one-minute song and a two-minute song into the first concert, and a three-minute song into the second concert. 
Then the difference will be equal to 0.

In the second test case, Luntik can include two one-minute songs and a two-minute song and a three-minute song into the first concert, and two three-minute songs 
into the second concert. The duration of the first concert will be 1+1+2+3=7, the duration of the second concert will be 6.
The difference of them is |7−6|=1.  */
________________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{ 
 
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
	           
	            int t=sc.nextInt();
	           
	            while(t-->0){
	              int a=sc.nextInt(),b=sc.nextInt()*2,c=sc.nextInt()*3;
	              long sum=a+b+c;
	              System.out.println((sum%2==0)?'0':'1');
	             
	            
	             
	        }
	    }
        catch(Exception e) 	{ return; }
	}
}

