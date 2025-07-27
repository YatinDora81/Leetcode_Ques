// class NumMatrix {
//     int ans[][];
//     public NumMatrix(int[][] mat) {
//         ans = new int[mat.length][mat[0].length];
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat[0].length;j++){
//                 ans[i][j] = mat[i][j] + 
//                             (i>0 ? ans[i-1][j] : 0) 
//                            + (j>0 ? ans[i][j-1] : 0) 
//                            - (i>0 && j>0 ? ans[i-1][j-1] : 0);
//             }
//         }
        
//     }
    
//     public int sumRegion(int row1, int col1, int row2, int col2) {
//         int del = 0;
//         if(row1>0) del+= ans[row1-1][col2];
//         if(col1>0) del+= ans[row2][col1-1];
//         if(row1>0 && col1>0) del-=ans[row1-1][col1-1];
//         return ans[row2][col2] - del;
//     }
// }

// /**
//  * Your NumMatrix object will be instantiated and called as such:
//  * NumMatrix obj = new NumMatrix(matrix);
//  * int param_1 = obj.sumRegion(row1,col1,row2,col2);
//  */