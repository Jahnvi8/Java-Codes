/* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

 
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
____________________________________________________________________________________________________________________________
class Main {
    public int[] productExceptSelf(int[] nums) {
        
        int[] answer = new int[nums.length];
        answer[0]=1;
         
        for (int i =0; i<nums.length-1; i++)
            answer[i+1]=answer[i]*nums[i];
         
        int right =1;
        for (int i=nums.length-1;i>=0;i--){
            answer[i]=right*answer[i];
            right = right*nums[i];
        }
        return answer;
    }
}
