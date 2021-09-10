// The game is simple. You initially have ‘H’ amount of health and ‘A’ amount of armor. At any instant you can live in any of the three places - fire, water and air. 
//   After every unit time, you have to change your place of living. For example if you are currently living at fire, you can either step into water or air.

// If you step into air, your health increases by 3 and your armor increases by 2

// If you step into water, your health decreases by 5 and your armor decreases by 10

// If you step into fire, your health decreases by 20 and your armor increases by 5

// If your health or armor becomes <=0, you will die instantly

// Find the maximum time you can survive.

// Input:

// The first line consists of an integer t, the number of test cases.
//   For each test case there will be two positive integers representing the initial health H and initial armor A.


// Output:

// For each test case find the maximum time you can survive.

 

// Note: You can choose any of the 3 places during your first move.

 

// Input Constraints:

// 1 <= t <= 10
// 1 <= H, A <= 1000

// Example:

// Sample Input:

// 3
// 2 10
// 4 4
// 20 8
// Sample Output:

// 1
// 1
// 5
______________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
    
   static int[][] dp=new int[1011][1011];
    
    public static int solve(int h,int a,int n){
        if(h<=0 || a<=0) return 0;
        if(dp[h][a]!=(-1)) return dp[h][a];
        
        int x=0,y=0,z=0;
        if(n!=1) x=1+solve(h+3,a+2,1);
        if(n!=2) y=1+solve(h-5,a-10,2);
        if(n!=3) z=1+solve(h-20,a+5,3);
        return dp[h][a]=Math.max(x,Math.max(y,z));
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{  try {
	     Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0){
	       int h=sc.nextInt();
	       int a=sc.nextInt();
	       for(int i=0;i<1011;i++){
             for(int j=0;j<1011;j++)
               dp[i][j]=-1;
            }
            System.out.println(Math.max(solve(h+3,a+2,1),
                               Math.max(solve(h-5,a-10,2),solve(h-20,a+5,3))
             
            )
            );
	   }
	} catch(Exception e) { return;
	}
	  
	}
}
