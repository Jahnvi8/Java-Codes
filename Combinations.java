https://leetcode.com/problems/combinations/

class Solution {
     void check( List<List<Integer>> subset,int index,List<Integer> current,int n,int k){
                if(current.size()==k){
                  subset.add(new ArrayList(current));
                    return;
                }
                for(int i=index;i<=n;i++){
                    current.add(i);
                    check(subset,i+1,current,n,k);
                    current.remove(current.size()-1);           
                }
     }

    public List<List<Integer>> combine(int n, int k) {
          List<List<Integer>> subset = new ArrayList();
        check(subset,1,new ArrayList(),n,k);
        return subset;
        
    }
}
