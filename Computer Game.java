// Monocarp is playing a computer game. Now he wants to complete the first level of this game.

// A level is a rectangular grid of 2 rows and n columns. Monocarp controls a character, which starts in cell (1,1) — at the intersection of the 1-st row and the 1-st column.

// Monocarp's character can move from one cell to another in one step if the cells are adjacent by side and/or corner. Formally, it is possible to move from cell (x1,y1) to cell (x2,y2) in one step if |x1−x2|≤1 and |y1−y2|≤1. Obviously, it is prohibited to go outside the grid.

// There are traps in some cells. If Monocarp's character finds himself in such a cell, he dies, and the game ends.

// To complete a level, Monocarp's character should reach cell (2,n) — at the intersection of row 2 and column n.

// Help Monocarp determine if it is possible to complete the level.

// Input
// The first line contains a single integer t (1≤t≤100) — the number of test cases. Then the test cases follow. Each test case consists of three lines.

// The first line contains a single integer n (3≤n≤100) — the number of columns.

// The next two lines describe the level. The i-th of these lines describes the i-th line of the level — the line consists of the characters '0' and '1'. The character '0' corresponds to a safe cell, the character '1' corresponds to a trap cell.

// Additional constraint on the input: cells (1,1) and (2,n) are safe.

// Output
// For each test case, output YES if it is possible to complete the level, and NO otherwise.

// Example
// inputCopy
// 4
// 3
// 000
// 000
// 4
// 0011
// 1100
// 4
// 0111
// 1110
// 6
// 010101
// 101010
// outputCopy
// YES
// YES
// NO
// YES
// Note
// Consider the example from the statement.

// In the first test case, one of the possible paths is (1,1)→(2,2)→(2,3).

// In the second test case, one of the possible paths is (1,1)→(1,2)→(2,3)→(2,4).

// In the fourth test case, one of the possible paths is (1,1)→(2,2)→(1,3)→(2,4)→(1,5)→(2,6).


_________________________________________________________________________________________________________________________________________
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
	             
	               int n=sc.nextInt();
	               int row=2;
	               char ar[][]=new char[2][n];
	               int k=0;
	               while(row-->0){
	                   String str=sc.next();
	                   for(int i=0;i<str.length();i++)
	                       ar[k][i]=str.charAt(i);
	                       k++;
	                   
	               }
	              
	               boolean die=false;
	               int i=0,j=0;
	               
	               while(j+1<n && die==false)
	               {  
	                   if(j+1<n && ar[0][j+1]=='1' && ar[1][j+1]=='1')
	                   die=true;
	                   j++;
	               }
	               if(die) System.out.println("NO");
	               else System.out.println("YES");
	            }
        	}
        catch(Exception e) 	{ return; }
	}
}
