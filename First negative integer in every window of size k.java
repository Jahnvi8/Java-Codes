// Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.

// Example 1:
// Input : 
// N = 5
// A[] = {-8, 2, 3, -6, 10}
// K = 2
// Output : 
// -8 0 -6 -6
// Explanation :
// First negative integer for each window of size k
// {-8, 2} = -8
// {2, 3} = 0 (does not contain a negative integer)
// {3, -6} = -6
// {-6, 10} = -6
 
// Example 2:
// Input : 
// N = 8
// A[] = {12, -1, -7, 8, -15, 30, 16, 28}
// K = 3
// Output :
// -1 -1 -7 -15 -15 0 
 

// Your Task:  
// You don't need to read input or print anything.
//   Your task is to complete the function printFirstNegativeInteger() which takes the array A[],
// its size N and an integer K as inputs and returns the first negative number in every window of size K starting from the first till the end. 
//   If a window does not contain a negative integer , then return 0 for that window.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(K)

// Constraints:
// 1 <= N <= 105
// 1 <= A[i] <= 105
// 1 <= K <= N
________________________________________________________________________________________________________________________
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
          {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends
//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long nums[], int N, int k)
    {     Deque<Object> dq = new LinkedList<Object> ();
        long[] ar=new long[nums.length-k+1];
        int i=0,j=0;
        
        
           while(j<nums.length){
               
            if(nums[j]<0)
               
            dq.addLast(nums[j]);
            
            //hit window size
            if(j-i+1==k){
                if(dq.isEmpty()) ar[i]=0;
                else{
                ar[i]=(long)dq.peekFirst();
                if(nums[i]==(long)dq.peekFirst()) dq.removeFirst();
                
                }
                
                i++;
                j++;
            }
            else j++;
        }
        return ar;
    }
        
    }
