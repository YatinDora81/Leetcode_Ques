// // 3195. Find the Minimum Area to Cover All Ones I

// class Solution {
//     public int minimumArea(int[][] grid) {
//         int r = grid.length;
//         int i=0;
//         while(i<grid.length){
//             boolean f= true;
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==1){
//                     f=false;
//                     break;
//                 }
//             }
//             if(f) r--;
//             else break;
//             i++;
//         }

//         i=grid.length-1;
//         while(i>=0){
//             boolean f= true;
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==1){
//                     f=false;
//                     break;
//                 }
//             }
//             if(f) r--;
//             else break;
//             i--;
//         }

//         int c=grid[0].length;
//         i=0;
//         while(i<grid[0].length){
//             boolean f= true;
//             for(int j=0;j<grid.length;j++){
//                 if(grid[j][i]==1){
//                     f=false;
//                     break;
//                 }
//             }
//             if(f) c--;
//             else break;
//             i++;
//         }
//         i=grid[0].length-1;
//         while(i>=0){
//             boolean f= true;
//             for(int j=0;j<grid.length;j++){
//                 if(grid[j][i]==1){
//                     f=false;
//                     break;
//                 }
//             }
//             if(f) c--;
//             else break;
//             i--;
//         }
//         return r*c;
//     }
// }