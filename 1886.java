// // 1886. Determine Whether Matrix Can Be Obtained By Rotation

// class Solution {
//     public boolean findRotation(int[][] mat, int[][] tar) {
//             if(is(mat,tar)) return true;
//             int arr[][] = new int[mat.length][mat.length];
//             for(int k=0;k<4;k++){
//                 arr = new int[mat.length][mat.length];
//                 for(int i=0;i<mat.length;i++) for(int j=0;j<mat.length;j++) arr[j][arr.length-1-i] = mat[i][j];
//                 if(is(arr,tar)) return true;
//                 mat = arr;
//             }
//             return false;


//     }
//     boolean is(int arr1[][] , int arr2[][]){
//         for(int i=0;i<arr1.length;i++) for(int j=0;j<arr1.length;j++) if(arr1[i][j]!=arr2[i][j]) return false;
//         return true;
//     }
// }