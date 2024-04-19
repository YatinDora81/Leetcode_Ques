// // 200. Number of Islands
// //Backtracking

// class Solution {
//     public int numIslands(char[][] grid) {
//         int ans =0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]=='1'){
//                     dfs(i,j,grid.length,grid[0].length,grid);
//                     ans++;
//                 }
//             }
//         }
//         return ans;
//     }
//     void dfs(int i,int j,int n,int m,char [][]grid){
//         if(i<0 || j<0 || i>=n ||j>=m || grid[i][j]!='1') return ;
//         grid[i][j]='2';
//         int dir[][]={{1,0},{-1,0},{0,-1},{0,1}};
//         for(int []d : dir){
//             dfs(i+d[0] , j+d[1] ,n,m,grid);
//         }
//     }
// }