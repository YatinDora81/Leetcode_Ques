// // 2482. Difference Between Ones and Zeros in Row and Column

// class Solution {
//     public int[][] onesMinusZeros(int[][] grid) {
//         int n = grid.length , m = grid[0].length;
//         int row[] = new int[n];
//         int col[] = new int[m];
//         int l1 = 0;
//         int l2 = 0;
//         for(int i=0;i<n;i++){
//             int a = 0;
//             for(int j=0;j<m;j++) if(grid[i][j]==1) a++;
//             row[l1++] = a;
//         }

//         for(int i=0;i<m;i++){
//             int a = 0;
//             for(int j =0;j<n;j++) if(grid[j][i]==1) a++;
//             col[l2++] = a;
//         }

//         int ans[][] = new int[n][m];
//         for(int i=0;i<n;i++) for(int j=0;j<m;j++) ans[i][j] = row[i] + col[j] - (n - row[i]) - (m-col[j]);
//         return ans;
//     }
// }