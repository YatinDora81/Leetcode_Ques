// // 733. Flood Fill

// class Solution {
//     public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//         int arr[][] = image;

//         int init = arr[sr][sc];
//         boolean [][]vis = new boolean[arr.length][arr[0].length];
//         dfs(sr,sc,arr,vis,init,color);

//         return arr;
//     }
//     void dfs(int i,int j,int [][]arr , boolean[][] vis , int init,int color){
//         if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]!=init || vis[i][j]) return;
//         vis[i][j] = true;
//         arr[i][j] = color;
//         int dire[][] = {{-1,0},{1,0},{0,-1},{0,1}};
//         for(int dir[] : dire){
//             dfs(i+dir[0] , j+dir[1] , arr , vis , init, color);
//         }
//     }
// }