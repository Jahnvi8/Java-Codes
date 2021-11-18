// Chef's favorite game is chess. Today, he invented a new piece and wants to see its strengths.

// From a cell (X,Y), the new piece can move to any cell of the chessboard such that its color is different from that of (X,Y).

// The new piece is currently located at cell (A,B). Chef wants to calculate the minimum number of steps required to move it to (P,Q).

// Note: A chessboard is an 8×8 square board, where the cell at the intersection of the i-th row and j-th column is denoted (i,j). Cell (i,j) 
//   is colored white if i+j is even and black if i+j is odd.

// Input Format
// The first line of input contains a single integer T denoting the number of test cases. The description of the test cases follows.
// Each test case consists of a single line of input, containing four space-separated integers A,B,P,Q.
// Output Format
// For each test case, output a single line containing one integer - the minimum number of moves taken by the new piece to reach (P,Q) from (A,B).

// Constraints
// 1≤T≤5000
// 1≤A,B,P,Q≤8
// Sample Input 1 
// 3
// 1 1 8 8
// 5 7 5 8
// 3 3 3 3
// Sample Output 1 
// 2
// 1
// 0
// Explanation
// Test Case 1: (1,1) and (8,8) have the same color, so Chef cannot move the new piece in 1 move. Chef can first move the piece from (1,1) to (8,1)
//   and then from (8,1) to (8,8), thus taking 2 moves.

// Test Case 2: (5,7) and (5,8) have different colors, so Chef can move the piece from (5,7) to (5,8) in 1 move.
________________________________________________________________________________________________________________________________________________________________
 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        
	      
	           Scanner sc=new Scanner(System.in);
	          	int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		 int a=sc.nextInt(),b=sc.nextInt(),p=sc.nextInt(),q=sc.nextInt();
		 if(a==p && b==q)
		 System.out.println("0");
		 else if((a+b)%2!=0 && (p+q)%2!=0)
		 System.out.println("2");
		 else if((a+b)%2==0 && (p+q)%2==0)
		 System.out.println("2");
		 else if((a+b)%2!=0 && (p+q)%2==0)
		 System.out.println("1");
		 else if((a+b)%2==0 && (p+q)%2!=0)
		 System.out.println("1");
		}
	          
        	}
        catch(Exception e) 	{ return; }
	}
}
