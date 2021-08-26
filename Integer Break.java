// Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.

// Return the maximum product you can get.

 

// Example 1:

// Input: n = 2
// Output: 1
// Explanation: 2 = 1 + 1, 1 × 1 = 1.
// Example 2:

// Input: n = 10
// Output: 36
// Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
 

// Constraints:

// 2 <= n <= 58
__________________________________________________________________________________________________________________________________________
class Solution {
    
    public int maxProduct(int n)
	{
		// Your code goes here
		if((n==2) || (n==3)) return (n-1);
		int ans=1;
		while(n>4){
		    n-=3;
		    ans*=3;
		}
		// int mod=((int)(Math.pow(10,9)))+7;
		return (n*ans);
	}
    public int integerBreak(int n) {
        return maxProduct(n);
            
    }
}
