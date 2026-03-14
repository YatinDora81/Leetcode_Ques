// https://leetcode.com/problems/flood-fill/

// class Solution {
//     public class pair{
//         int i,j;
//         public pair(int i,int j){
//             this.i = i;
//             this.j = j;
//         }
//     }
//     public int[][] floodFill(int[][] grid, int sr, int sc, int c) {
//         Queue<pair> q = new LinkedList<>();
//         int start = grid[sr][sc];
//         q.add(new pair(sr,sc));
//         grid[sr][sc] = -1;
//         while(q.size()>0){
//             pair p = q.remove();
//             int dirr[][] = {{-1,0},{1,0},{0,-1},{0,1}};
//             for(int dir[] : dirr){
//                 int ni = p.i + dir[0];
//                 int nj = p.j + dir[1];
//                 if(is(ni,nj,grid,start)){
//                     q.add(new pair(ni,nj));
//                     grid[ni][nj] = -1;
//                 }
//             }
//         }
//         for(int i=0;i<grid.length;i++) System.out.println(Arrays.toString(grid[i]));
//         for(int i=0;i<grid.length;i++) for(int j=0;j<grid[0].length;j++) if(grid[i][j]==-1) grid[i][j] = c;
//         return grid;
//     }
//     public boolean is(int i,int j,int [][]grid,int start){
//         return i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==start;
//     }
// }