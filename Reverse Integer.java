// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
// Example 4:

// Input: x = 0
// Output: 0
______________________________________________________________________________________________________________________
class Solution {
    public int reverse(int x) {

      int n=1;int rev=0,c=0,r=0;
       int MAX=pow(2,31)-1;
        int MIN=-pow(2,31);
       
        while(x!=0)
        {
            if(rev>MAX/10 || rev<MIN/10)return 0;
            r=x%10;
            rev=10*rev+r;
            x=x/10;

        }
      
        return rev;
        
    }
}
