// https://leetcode.com/problems/rotting-oranges/

// class Solution {
//     public class pair{
//         int i,j;
//         public pair(int i,int j){
//             this.i = i;
//             this.j = j;
//         }
//     }
//     public int orangesRotting(int[][] grid) {
//         Queue<pair> q = new LinkedList<>();
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==2) q.add(new pair(i,j));
//             }
//         }

//         int ans = 0;
//         while(q.size()>0){
//             int n = q.size();
//             int dirr[][] = {{-1,0},{1,0},{0,-1},{0,1}};
//             boolean have = false;
//             for(int k=0;k<n;k++){
//                 pair p = q.remove();
//                 for(int dir[] : dirr){
//                     int ni = p.i + dir[0];
//                     int nj = p.j + dir[1];
                    
//                     if(is(ni,nj,grid)){
//                         q.add(new pair(ni,nj));
//                         grid[ni][nj] = 2;
//                         have = true;
//                     }
//                 }
//             }
//             if(have) ans++;
//         }

//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==1) return -1;
//             }
//         }

//         return ans;
//     }
//     public boolean is(int i,int j,int [][]grid){
//         return i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==1;
//     }
// }