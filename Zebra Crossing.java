// There's a zebra crossing appearing in the middle of nowhere with N blocks in it. 
//   The colors of the zebra crossing is represented by a binary string S, where Si is 1 if the i-th block from the left is white, and 0 if the block is black.

// Chef really wants to play with the zebra crossing. Although the given zebra crossing might not have alternate black and white blocks, 
// Chef wants to follow the alternating white-black color pattern while crossing it.

// Initially, Chef stands at block 1. Chef has to jump exactly K times, and in each jump he has to move forward and jump to a different color than that previously occupied by Chef.
//   More formally, suppose that Chef is currently at block i and wants to jump to block j then following conditions should hold:

// i<j
// Si≠Sj
// Output the farthest block Chef can reach with exactly K jumps. If Chef cannot jump exactly K times, output -1.

// Input Format
// The first line contains an integer T denoting the number of test cases. The T test cases then follow.
// The first line of each test case contains two integers N and K.
// The second line of each test case consists of a binary string of length N denoting the color of blocks of the zebra crossing.
// Output Format
// For each test case, output the farthest block Chef can reach with exactly K jumps, or -1 in case Chef cannot jump exactly K times.

// Constraints
// 1≤T≤105
// 2≤N≤103
// 1≤K≤N
// Sum of N over all test cases does not exceed 5⋅105
// Sample Input 1 
// 3
// 6 2
// 100101
// 5 1
// 10111
// 6 1
// 000000
// Sample Output 1 
// 6
// 2
// -1
_________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	            int t=sc.nextInt();
	            while(t-->0){
	                int n=sc.nextInt(),
	                    k=sc.nextInt(),
                        c=0;
	                String str=sc.next();
	                for(int i=1;i<n;i++){
	                    if(str.charAt(i)!=str.charAt(i-1))
	                    c++;
	                }
	                if(c>=k){
	                    for(int i=n-1;i>=0;i--){
	                        if(k%2!=0 && str.charAt(i)!=str.charAt(0)) {
	                            System.out.println(i+1);
	                            break;
	                        }
	                       else if(k%2==0 && str.charAt(i)==str.charAt(0)) {
	                           System.out.println(i+1);
	                           break;
	                       }
	                    }
	                }
	                else
	                System.out.println("-1");
	          
	            }
        	}
        catch(Exception e) 	{ return; }
	}
}
