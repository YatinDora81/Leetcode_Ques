// class Solution {
//     public int numberOfSubmatrices(char[][] grid) {
//         int n = grid.length , m = grid[0].length;
//         int xarr[][] = new int[n][m];
//         int yarr[][] = new int[n][m];

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(i==0 && j==0){
//                     xarr[i][j] = grid[0][0]=='X' ? 1 : 0;
//                     yarr[i][j] = grid[0][0]=='Y' ? 1 : 0;
//                 }
//                 else{
//                     int x = grid[i][j]=='X' ? 1 : 0;
//                     int y = grid[i][j]=='Y' ? 1 : 0;
//                     int cx = x ;
//                     int cy = y ;
//                     if(j>0){
//                         cx += xarr[i][j-1];
//                         cy += yarr[i][j-1];
//                     }
//                     if(i>0){
//                         cx += xarr[i-1][j];
//                         cy += yarr[i-1][j];
//                     }
//                     if(i>0 && j>0){
//                         cx -= xarr[i-1][j-1];
//                         cy -= yarr[i-1][j-1];
//                     }
//                     xarr[i][j] = cx;
//                     yarr[i][j] = cy;
//                 }
//             }
//         }

//         int ans = 0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if( xarr[i][j]==yarr[i][j] && xarr[i][j]!=0 ) ans++;
//             }
//         }
//         return ans;
//     }
// }