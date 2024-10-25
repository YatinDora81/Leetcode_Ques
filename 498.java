// // 498. Diagonal Traverse

// class Solution {
//     public int[] findDiagonalOrder(int[][] mat) {
//         List<Integer> ans = new ArrayList<>();
//         List<Integer> ll = new ArrayList<>();
//         int n = mat.length , m = mat[0].length;
//         boolean f = false;

//         for(int ni=0;ni<n;ni++){
//             int i = ni;
//             int j = 0;

//             while( i>=0 && i<n && j>=0 && j<m ){
//                 if(!f) ll.add(mat[i][j]);
//                 else ll.add(0, mat[i][j]);
//                 i--;
//                 j++;
//             }
//             f = !f;
//             for( int y : ll) ans.add(y);
//             ll = new ArrayList<>();
//         }

//         for(int nj=1;nj<m;nj++){
//             int i = n-1;
//             int j = nj;

//             while( i>=0 && i<n && j>=0 && j<m ){
//                 if(!f) ll.add(mat[i][j]);
//                 else ll.add(0, mat[i][j]);
//                 i--;
//                 j++;
//             }
//             f = !f;
//             for( int y : ll) ans.add(y);
//             ll = new ArrayList<>();
//         }
//         int arr[] = new int[ans.size()];
//         for(int i=0;i<arr.length;i++) arr[i] = ans.get(i);
//         return arr;
//     }
// }