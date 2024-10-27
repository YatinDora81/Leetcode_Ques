// // 1582. Special Positions in a Binary Matrix

// class Solution {
//     public int numSpecial(int[][] mat) {
//         int c = 0;
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat[0].length;j++){
//                 if( mat[i][j]==1 && is(mat , i , j) ) c++;
//             }
//         }
//         return c;
//     }
//     public boolean is(int [][]mat , int r , int c){
//         for(int i=0;i<mat[0].length;i++){
//             if( mat[r][i]==1 && i!=c ) return false;
//         }
//         for(int i=0;i<mat.length;i++){
//             if( mat[i][c]==1 && i!=r ) return false;
//         }
//         return true;
//     }
// }