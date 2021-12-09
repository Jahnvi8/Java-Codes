// Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

// The distance between two adjacent cells is 1.

 

// Example 1:


// Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
// Output: [[0,0,0],[0,1,0],[0,0,0]]
// Example 2:


// Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
// Output: [[0,0,0],[0,1,0],[1,2,1]]
 

// Constraints:

// m == mat.length
// n == mat[i].length
// 1 <= m, n <= 104
// 1 <= m * n <= 104
// mat[i][j] is either 0 or 1.
// There is at least one 0 in mat.
_________________________________________________________________________________________________________________________________________________________________
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat==null || mat.length==0) return mat;
        
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0) {
                    q.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        final int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cur=q.poll();
                int cur_x=cur[0];
                int cur_y=cur[1];
                 for(int[] d : dir){
                    int x=cur_x + d[0];
                    int y=cur_y+d[1];
                   if(x<0 || x>mat.length-1 || y<0 || y>mat[0].length-1 || visited[x][y])
                        continue;
                    mat[x][y] = mat[cur_x][cur_y] + 1;
                    q.offer(new int[]{x,y});
                    visited[x][y] = true;
                }
            }
        }
        return mat;
    }
}
