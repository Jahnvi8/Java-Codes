// Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

 
// Example 1:
// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
  
// Example 2:
// Input: arr = [1,2] 
// Output: false
  
// Example 3:
// Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
// Output: true
 

// Constraints:

// 1 <= arr.length <= 1000
// -1000 <= arr[i] <= 1000
___________________________________________________________________________________________________________________________________________
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:arr)
            hm.put(n,hm.getOrDefault(n,0)+1);
        
            HashMap<Integer,Integer> hm_new=new HashMap<>();
        for(int i:hm.values()){
            if(hm_new.containsKey(i)) return false;
            hm_new.put(i,1);
        }
        return true;
        
    }
}
