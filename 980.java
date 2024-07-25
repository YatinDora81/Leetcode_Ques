// // 980. Unique Paths III

// class Solution {
//     public int uniquePathsIII(int[][] grid) {
//         int empty = 0;
//         int ni =0;
//         int nj=0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if( grid[i][j]==1 ){
//                     ni =i;
//                     nj=j;
//                 }
//                 else if(grid[i][j]==0) empty++;
//             }
//         }
//         return tell(ni,nj,grid.length,grid[0].length,grid,empty);
//     }
//     int tell(int i,int j,int n,int m,int [][]arr,int empty){
//         if(i<0 || j<0 || i>=n || j>=m || arr[i][j]==-1 ) return 0;
//         if(arr[i][j]==2) return empty==-1 ? 1 : 0;

//         int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
//         int t = arr[i][j];
//         arr[i][j] = -1;
//         empty--;
//         int ans = 0;
//         for(int d[] : dir){
//             int ni = i + d[0];
//             int nj = j + d[1];
//             ans = ans +  tell(ni,nj,n,m,arr,empty);
//         }
//         arr[i][j] = t;
//         empty++;
//         return ans;
//     }
// }


// class Solution {
//     public int uniquePathsIII(int[][] grid) {
//         int ans=0;
//         boolean flag[][]= new boolean[grid.length][grid[0].length];
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if( grid[i][j]==1 ){
//                     return tell(i,j,grid.length,grid[0].length,grid,flag);
//                 }
//             }
//         }
//         return -1;
//     }
//     int tell(int i,int j,int n,int m,int [][]arr,boolean [][]flag){
//         if(i<0 || j<0 || i>=n || j>=m || arr[i][j]==-1 || flag[i][j]==true) return 0;
//         if(arr[i][j]==2 && isAllTrue(flag,arr) ) return 1;
//         int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
//         int t = arr[i][j];
//         arr[i][j] = -1;
//         flag[i][j] = true;
//         int ans = 0;
//         for(int d[] : dir){
//             int ni = i + d[0];
//             int nj = j + d[1];
//             ans = ans +  tell(ni,nj,n,m,arr,flag);
//         }
//         arr[i][j] = t;
//         flag[i][j] = false;
//         return ans;
//     }

//     boolean isAllTrue(boolean [][]flag , int [][]arr){
//         for(int i=0;i<flag.length;i++){
//             for(int j=0;j<flag[0].length;j++){
//                 if(flag[i][j]==false && arr[i][j]==0) return false;
//             }
//         }
//         return true;
//     }
// }