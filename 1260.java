// // 1260. Shift 2D Grid

// class Solution {
//     public List<List<Integer>> shiftGrid(int[][] grid, int k) {
//         int n = grid.length , m = grid[0].length;
//         for(int t=0;t<k;t++){
//             int arr[][] = new int[grid.length][grid[0].length];
//             for(int i=0;i<grid.length;i++) for(int j=0;j<grid[0].length;j++) arr[i][(j+1)%m] = grid[i][j];
            
//             for(int i=0;i<grid.length;i++){
//                 arr[  (i+1)%n ][ 0 ] = grid[i ][ m-1 ];
//             }
            
//             for(int i=0;i<grid.length;i++) for(int j=0;j<grid[0].length;j++) grid[i][j] = arr[i][j];
//         }
//         List<List<Integer>> ans = new ArrayList<>();
//         for(int i=0;i<n;i++){
//             List<Integer> ll = new ArrayList<>();
//             for(int j=0;j<m;j++){
//                 ll.add(grid[i][j]);
//             }
//             ans.add(ll);
//         }
//         return ans;

//     }
// }