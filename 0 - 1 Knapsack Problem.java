// You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
//   Note that we have only one quantity of each item.
// In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively.
//   Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item or don’t pick it (0-1 property).

// Example 1:

// Input: 
// N = 3
// W = 4
// values[] = {1,2,3}
// weight[] = {4,5,1}
// Output: 3
// Example 2:

// Input:
// N = 3
// W = 3
// values[] = {1,2,3}
// weight[] = {4,5,6}
// Output: 0
// Your Task:
// Complete the function knapSack() which takes maximum capacity W, weight array wt[], value array val[], and the number of items n as a parameter and 
// returns the maximum possible value you can get.

// Expected Time Complexity: O(N*W).
// Expected Auxiliary Space: O(N*W)

// Constraints:
// 1 ≤ N ≤ 1000
// 1 ≤ W ≤ 1000
// 1 ≤ wt[i] ≤ 1000
// 1 ≤ v[i] ≤ 1000
____________________________________________________________________________________________________________________________________________
// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends



class Solution 
{ 
   
  
    static int knapSackRec(int w, int wt[], int val[], int n,int[][] dp) 
    { 
         // your code here 
         if(n==0 || w==0 ) return 0;
         if (dp[n][w] != -1)
            return dp[n][w];  
         if(wt[n-1]>w)
          return dp[n][w]=knapSackRec(w, wt, val,n - 1, dp);
         else 
              return dp[n][w] = Math.max((val[n - 1] + knapSackRec(w - wt[n - 1], wt, val, n - 1, dp)), knapSackRec(w, wt, val, n - 1, dp));    
      } 
    static int knapSack(int W, int wt[], int val[], int n)
{ 
    int dp[][] = new int[n + 1][W + 1];
    for(int i = 0; i < n + 1; i++)  
        for(int j = 0; j < W + 1; j++)  
            dp[i][j] = -1;   
     
    return knapSackRec(W, wt, val, n, dp);    
}
}


