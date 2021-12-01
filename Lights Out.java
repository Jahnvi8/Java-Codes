// Lenny is playing a game on a 3 × 3 grid of lights. In the beginning of the game all lights are switched on. 
//   Pressing any of the lights will toggle it and all side-adjacent lights. The goal of the game is to switch all the lights off.
//     We consider the toggling as follows: if the light was switched on then it will be switched off, if it was switched off then it will be switched on.

// Lenny has spent some time playing with the grid and by now he has pressed each light a certain number of times. Given the number of times each light is pressed,
// you have to print the current state of each light.

// Input
// The input consists of three rows. Each row contains three integers each between 0 to 100 inclusive. The j-th number in the i-th row is the number of times the j-th light 
// of the i-th row of the grid is pressed.

// Output
// Print three lines, each containing three characters. The j-th character of the i-th line is "1" if and only if the corresponding light is switched on, otherwise it's "0".

// Examples
// inputCopy
// 1 0 0
// 0 0 0
// 0 0 1
// outputCopy
// 001
// 010
// 100
// inputCopy
// 1 0 1
// 8 8 8
// 2 0 3
// outputCopy
// 010
// 011
// 100

______________________________________________________________________________________________________________________________________________________
 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	           int[][] ar=new int[3][3];
	           boolean[][] ans=new boolean[3][3];
	           for(int i=0;i<3;i++){
	               for(int j=0;j<3;j++){
	                   ar[i][j]=sc.nextInt();
	                   ans[i][j]=true;
	               }
	           }
	           
	        
	           
	            for(int i=0;i<3;i++){
	               for(int j=0;j<3;j++){
	                   if((ar[i][j]&1)==1){
	                       ans[i][j]=!ans[i][j];
	                       if(i-1>=0) ans[i-1][j]=!ans[i-1][j];
	                        if(i+1<3) ans[i+1][j]=!ans[i+1][j];
	                         if(j-1>=0) ans[i][j-1]=!ans[i][j-1];
	                          if(j+1<3) ans[i][j+1]=!ans[i][j+1];
	                   }
	               }
	           }
	           
	            for(int i=0;i<3;i++){
	               for(int j=0;j<3;j++){
	                   if(ans[i][j]==false) 
	                  System.out.print("0");
	                  else 
	                  System.out.print("1");
	               }
	               System.out.println();
	           }
	           
        	}
        catch(Exception e) 	{ return; }
	}
}
