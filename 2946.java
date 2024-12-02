// // 2946. Matrix Similarity After Cyclic Shifts

// class Solution {
//     public boolean areSimilar(int[][] mat, int k) {
//         int ans[][] = new int[mat.length][mat[0].length];
//         k = k % mat[0].length;
//         for(int i=0;i<mat.length;i++){
//             if(i%2==0){
//                 for(int j=0;j<mat[0].length;j++){
//                     ans[i][j] = mat[i][(j+k)%mat[0].length];
//                 }
//             }
//             else{
//                 for(int j=0;j<mat[0].length;j++){
//                     ans[i][(j+k)%mat[0].length] = mat[i][j]; 
//                 }
//             }
//         }
//         for(int i=0;i<mat.length;i++){
//             if(!Arrays.equals(mat[i],ans[i])) return false;
//         }
//         return true;
//     }
// }