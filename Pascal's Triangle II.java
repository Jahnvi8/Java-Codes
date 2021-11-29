// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

// Example 1:

// Input: rowIndex = 3
// Output: [1,3,3,1]
// Example 2:

// Input: rowIndex = 0
// Output: [1]
// Example 3:

// Input: rowIndex = 1
// Output: [1,1]
 

// Constraints:

// 0 <= rowIndex <= 33
____________________________________________________________________________________________________________________________
class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> row,pre=null;
        for(int i=0;i<rowIndex+1;i++){
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
                if(j==0 || j==i) row.add(1);
                else row.add(pre.get(j-1)+pre.get(j));
            pre=row;
           
        }
        return pre;
    }
}
