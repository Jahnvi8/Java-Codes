// You are given an m x n grid where each cell can have one of three values:

// 0 representing an empty cell,
// 1 representing a fresh orange, or
// 2 representing a rotten orange.
// Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

// Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

 

// Example 1:


// Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
// Output: 4
// Example 2:

// Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
// Output: -1
// Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
// Example 3:

// Input: grid = [[0,2]]
// Output: 0
// Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
 

// Constraints:

// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 10
// grid[i][j] is 0, 1, or 2.
__________________________________________________________________________________________________________________________________________________________
class Solution {
      public int orangesRotting(int[][] grid) {
      if(grid==null || grid.length==0) return 0;
        Queue<int[]> q=new LinkedList<>();
        int ini_count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) q.offer(new int[]{i,j});
                if(grid[i][j]!=0) ini_count++;
            }
        }
        if(ini_count==0) return 0;
        int countMin=0,count=0;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        while(!q.isEmpty()){
            int size=q.size();
            count+=size;
            for(int i=0;i<size;i++){
                int[] p=q.poll();
                 for(int j=0;j<4;j++) {
                    int x=p[0]+dx[j];
                    int y=p[1]+dy[j];  
                    if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]==0                      || grid[x][y]==2) continue;   
                    grid[x][y]=2;
                    q.offer(new int[]{x,y});
                }
            }
             if(q.size()!=0) countMin++;
        }
         return ini_count==count?countMin:-1; 
    }
}
