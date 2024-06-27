// // 329. Longest Increasing Path in a Matrix

// class Solution {
//     public int longestIncreasingPath(int[][] arr) {
//         int n=arr.length;
//         int m=arr[0].length;
//         int ans = 1;
//         int dp[][] = new int[n][m];
//         for(int i[] : dp) Arrays.fill(i,-1);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 ans = Math.max(ans, tell(i,j,n,m,arr,dp) );
//             }
//         }
//         return ans;
//     }
//     int tell(int i,int j,int n,int m,int [][]arr,int dp[][]){
//         if(i<0 || j<0 || i>=n || j>=m ) return 0;
//         if(dp[i][j]!=-1) return dp[i][j];
//         int f1=1;

//         if( !(i-1<0 || j<0 || i-1>=n || j>=m)  && arr[i][j]<arr[i-1][j] ){
//             f1 = Math.max(f1 ,  1 + tell(i-1,j,n,m,arr,dp) );
//         }
//         if( !(i+1<0 || j<0 || i+1>=n || j>=m) && arr[i][j]<arr[i+1][j]  ){
//             f1 = Math.max(f1 ,  1 + tell(i+1,j,n,m,arr,dp) );
//         }
//         if( !(i<0 || j-1<0 || i>=n || j-1>=m) && arr[i][j]<arr[i][j-1] ){
//             f1 = Math.max(f1 ,  1 + tell(i,j-1,n,m,arr,dp) );
//         }
//         if( !(i<0 || j+1<0 || i>=n || j+1>=m) && arr[i][j]<arr[i][j+1]  ){
//             f1 = Math.max(f1 ,  1 + tell(i,j+1,n,m,arr,dp) );
//         }
        
//         return dp[i][j]=f1;

//     }
// }