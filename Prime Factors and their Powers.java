// Given a number N, print all its unique prime factors and their powers in N.

// Example 1:

// Input: N = 100
// Output: 2 2 5 2
// Explaination: 100 can be written as 2*2*5*5,
// where 2 is present two times and so is 5.
// Eaxmple 2:

// Input: N = 3
// Output: 3 1
// Explaination: 3 itself is a prime.
// Your Task:
// You do not need to read input or print anything. Your task is to complete the function primeFactors() which takes N as input parameter 
// and returns the prime factors and their powers where each prime factor is followed by its power and 
// then another prime factor-power pair and all the prime factors are sorted in ascending order.

// Expected Time Complexity: O(logN)
// Expected Auxiliary Space: O(N)

// Constraints:
// 2 ≤ N ≤ 104  
_____________________________________________________________________________________________________________________________________________
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.primeFactors(N);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < ans.size();i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> primeFactors(int n){
        // code here
       
         ArrayList<Integer> al1=new ArrayList<>();
         ArrayList<Integer> al2=new ArrayList<>();
         for(int i=2;i*i<=n;i++){
            int k=1;
            boolean flag=false;
            while(n%i==0){
                flag=true;
                if(al1.contains(i)){
                    k++;
                }
                else al1.add(i);
             
                n/=i;
            }
            if(flag)
            { al2.add(i);
              al2.add(k);
            }
        }
        if(n>1) {
           
            al2.add(n);
            al2.add(1);
        }
       
        return al2;
    }
}
