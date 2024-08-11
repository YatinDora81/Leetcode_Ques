// // 840. Magic Squares In Grid

// class Solution {
//     public int numMagicSquaresInside(int[][] grid) {
//         if(grid.length<3 || grid[0].length<3) return 0;
//         int ans = 0;
//         for(int i=0;i<grid.length-2;i++){
//             for(int j=0;j<grid[0].length-2;j++){
//                 if( is(grid,i,j) ) ans++;
//             }
//         }
//         return ans;
//     }
//     boolean is(int [][]grid , int r,int c){
        
//         int dig1 = grid[r][c] + grid[r+1][c+1] + grid[r+2][c+2];
//         int dig2 = grid[r][c+2] + grid[r+1][c+1] + grid[r+2][c];
//         if(dig1!=15 || dig2!=15) return false;

//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 if(!(grid[r+i][c+j] >0 && grid[r+i][c+j]<10)) return false;
//                 set.add(grid[r+i][c+j]);
//             }
//         }
//         if(set.size()!=9) return false;
//         int rs = grid[r][c] + grid[r][c+1] + grid[r][c+2];
//         int cs = grid[r][c] + grid[r+1][c] + grid[r+2][c];
         
//         for(int i=0;i<3;i++){
//             int c1=0,c2=0;
//             for(int j=0;j<3;j++){
//                 c1+=grid[i+r][j+c];
//                 c2+=grid[j+r][i+c];
//             }
//             if( c1!=rs || c2!=cs ){
//                 return false;
//             }
//         }
//         return true;
//     }
// }