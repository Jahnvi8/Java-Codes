https://leetcode.com/problems/subsets-ii/



class Solution {
    public List<List<Integer>> subsetsWithDup(int[] A) {
        Arrays.sort(A);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        find_subsets(A,subset,0,ans);
        return ans;
    }
    public void find_subsets(int nums[],List<Integer> subset,int i,List<List<Integer>> ans)
    {
      
        ans.add(new ArrayList<>(subset));
        for(int j=i;j<nums.length;j++)
        {
            if(j!=i && nums[j]==nums[j-1])
                continue;
            subset.add(nums[j]);
            find_subsets(nums,subset,j+1,ans);
            subset.remove(subset.size()-1);
        }
    }

}
