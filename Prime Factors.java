// Given a number N. Find its unique prime factors in increasing order.
 

// Example 1:

// Input: N = 100
// Output: 2 5
// Explanation: 2 and 5 are the unique prime
// factors of 100.
// Example 2:

// Input: N = 35
// Output: 5 7
// Explanation: 5 and 7 are the unique prime
// factors of 35.
 

// Your Task:
// You don't need to read or print anything. Your task is to complete the function AllPrimeFactors() which takes N as input parameter and
//   returns a list of all unique prime factors of N in increasing order.

 

// Expected Time Complexity: O(N)
// Expected Space Complexity: O(N)
 

// Constraints:
// 1 <= N  <= 106
_________________________________________________________________________________________________________________________________________________
// { Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends




class Solution
{
    public int[] AllPrimeFactors(int n)
    {
        Set<Integer> s=new HashSet<>();
        
       
        for(int i=2;i*i<=n;i++){
            
            while(n%i==0){
                s.add(i);
                n/=i;
            }
            
        }
        if(n>1) s.add(n);
        int[] ar=new int[s.size()];
        int k = 0;
        for (int x : s)
            ar[k++] = x;
            Arrays.sort(ar);
        return ar;
    }
}
