// // 3142. Check if Grid Satisfies Conditions

// class Solution {
//     public boolean satisfiesConditions(int[][] grid) {
//         int n  = grid.length , m = grid[0].length;
//         for(int i=0;i<n;i++){
//             for(int j =0 ;j<m;j++){
//                 boolean f = false;
//                 if(  (i==n-1 && j==m-1) || (((i+1<n && grid[i][j] == grid[i+1][j]) || i+1==n) &&  (( j+1<m && grid[i][j]!=grid[i][j+1] ) || j+1==m) ) ) continue;
//                 return false;
//             }
//         }
//         return true;
//     }
// }