// class Solution {
//     public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
//         for(int t=0;t<k/2;t++){
//             int srow = x+t;
//             int col = y;
//             int erow = x+k-1-t;
//             List<Integer> ll = new ArrayList<>();
//             for(int i=col;i<col+k;i++){
//                 ll.add(grid[srow][i]);
//             }

//             for(int i=col;i<col+k;i++){
//                 grid[srow][i] = grid[erow][i];
//             }

//             for(int i=col;i<col+k;i++){
//                 grid[erow][i] = ll.remove(0);
//             }
//         }
//         return grid;
//     }
// }