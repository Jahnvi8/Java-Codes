// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
// Example 1:
// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10

// Example 2:
// Input: n = 5
// Output: [0,1,1,2,1,2]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// 3 --> 11
// 4 --> 100
// 5 --> 101
 

// Constraints:
// 0 <= n <= 105
___________________________________________________________________________________________________________________________________________________
class Solution {
    
    public int csb(int k){
        int res=0;
        while(k!=0){
            int rmsb= k & -k;
            k-=rmsb;
            res++;
        }
        return res;
    }
    
    public int[] countBits(int n) {
        
        int ar[]=new int[n+1];
        
        for(int i=1;i<=n;i++){
            int count=csb(i);
            ar[i]=count;
        }
        return ar;
    }
}
