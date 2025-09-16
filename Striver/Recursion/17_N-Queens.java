// class Solution {
//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> ans = new ArrayList<>();
//         boolean placed[][] = new boolean[n][n];

//         // for(int i=0;i<n;i++){
//             solve(0,n,placed,ans);
//         // }
//         return ans;
//     }
//     public void solve(int row , int n ,boolean placed[][] , List<List<String>> ans ){
//         if(row==n){
//             List<String> ll = new ArrayList<>();
//             for(int i=0;i<n;i++){
//                 StringBuilder sb = new StringBuilder("");
//                 boolean isQueen = false;
//                 for(int j=0;j<n;j++){
//                     if(placed[i][j]){
//                         sb.append("Q");
//                         isQueen = true;
//                     }
//                     else sb.append(".");
//                 }
//                 if(isQueen) ll.add(sb.toString());
//             }
//             if(ll.size()==n) ans.add(ll);
//             return;
//         }

//         for(int col=0;col<n;col++){
//             if( canPlace(placed , row , col) ){
//                 placed[row][col] = true;
//                 solve(row+1,n,placed , ans);
//                 placed[row][col] = false;
//             }
//         }
//     }
//     public boolean canPlace(boolean [][]placed , int row , int col){
//         int n = placed.length;
//         int i = row , j = col;
//         while(i>=0){
//             if(placed[i][col]) return false;
//             i--;
//         }
//         i = row;
//         while(i>=0 && j>=0){
//             if(placed[i][j]) return false;
//             i--;j--;
//         }
//         i=row;j=col;
//         while(i>=0 && j<n){
//             if(placed[i][j]) return false;
//             i--;j++;
//         }
//         return true;
//     }
// }