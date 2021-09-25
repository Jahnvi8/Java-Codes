// Given an integer array nums of unique elements, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]
 

// Constraints:

// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
// All the numbers of nums are unique.
________________________________________________________________________________________________________________________________________
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
          List<Integer> l=new ArrayList<>();
       
          check(0,l,res,nums.length,nums);
          return res ;
        
    }
    
    public void check(int i,List<Integer> al,List<List<Integer>> result,int n,int[] arr){
        if(i==n) {
            result.add(new ArrayList<>(al));
            return;
        }
        al.add(arr[i]);
         check(i+1,al,result,n,arr);
        al.remove(al.size()-1);
         check(i+1,al,result,n,arr);
    }
}
