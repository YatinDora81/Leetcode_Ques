// class Solution {
//     public boolean exist(char[][] arr, String word) {
//         int n  =arr.length, m = arr[0].length;
//         boolean [][]vis = new boolean[n][m];
//         boolean ans = false;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if( arr[i][j] == word.charAt(0) ){
//                     ans = solve(i,j,n,m,0,word,arr,vis);
//                     if(ans) return ans;
//                 }
//             }
//         }
//         return ans;
//     }
//     public boolean solve(int i,int j,int n,int m, int k,String s,char [][]arr,boolean vis[][]){
//         if(k==s.length()) return true;
//         if(i<0 || j<0 || i>=n || j>=m || arr[i][j]!=s.charAt(k) || vis[i][j]) return false;
//         vis[i][j] = true;

//         int dir[][] = { {-1,0},{1,0},{0,-1},{0,1} };
//         boolean ans = false;
//         for(int d[] : dir){
//             ans = ans 3|| solve( i+d[0] , j+d[1] , n , m , k+1 , s , arr , vis);
//             if(ans) return ans;
//         }
//         vis[i][j] = false;
//         return ans;
//     }
// }