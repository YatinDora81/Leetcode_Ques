// // 1329. Sort the Matrix Diagonally

// class Solution {
//     public int[][] diagonalSort(int[][] mat) {
//         int i=0;
//         int n = mat.length;
//         int m = mat[0].length;
//         int arr[][] = new int[n][m];
        
//         for(i =0;i<n;i++){
//             List<Integer> ll = new ArrayList<>();
//             int j=0;
//             int ni = i;
//             while(ni < n && j<m){
//                 ll.add(mat[ni][j]);
//                 j++;
//                 ni++;
//             }
//             Collections.sort(ll);
//             j=0;
//             ni = i;
//             while(ni < n && j<m){
//                 arr[ni][j] = ll.remove(0);
//                 j++;
//                 ni++;
//             }
//         }
//         for(int j=1;j<m;j++){
//             List<Integer> ll = new ArrayList<>();
//             i=0;
//             int nj = j;
//             while(i<n && nj<m){
//                 ll.add(mat[i][nj]);
//                 nj++;
//                 i++;
//             }
//             Collections.sort(ll);
//             i=0;
//             nj = j;
//             while(i<n && nj<m){
//                 arr[i][nj]=ll.remove(0);
//                 nj++;
//                 i++;
//             }
//         }
//         return arr;
//     }
// }