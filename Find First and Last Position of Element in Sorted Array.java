https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = firstOccurrence(nums, target);
        arr[1] = lastOccurrence(nums, target);
        
        return arr;
    }
    
    //first occurrence
    public int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                end = mid-1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
    
    //last occurrence
    public int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
}
