// // 3033. Modify the Matrix

// class Solution {
//     public int[][] modifiedMatrix(int[][] arr) {
//         int ans[][]= new int[arr.length][arr[0].length];
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 if(arr[i][j]==-1){
//                     ans[i][j] = find(arr,i,j);
//                 }
//                 else ans[i][j] = arr[i][j];
//             }
//         }
//         return ans;
//     }
//     int find(int[][] arr , int r, int c){
//         int maxi = -1;
//         for(int i=0;i<arr.length;i++){
//             maxi = Math.max(maxi , arr[i][c]);
//         }
//         return maxi;
//     }
// }