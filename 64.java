// // 64. Minimum Path Sum


// class Solution {
//     public int minPathSum(int[][] arr) {
//         int n = arr.length;
//         int m = arr[0].length;

//         int ans = tell4(arr,n,m);

//         return ans;
//     }

//     int tell4(int [][]arr,int n,int m){
//         // space optimization
//         int prev[]=new int[m];
//         int curr[]=new int[m];
        
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(i==0 && j==0) curr[0] = arr[0][0];
//                 else{
//                     int up=arr[i][j], left=arr[i][j];
//                     if(i-1>=0) up+= prev[j];
//                     else up += (int)1e8;
//                     if(j-1>=0) left += curr[j-1];
//                     else left += (int) 1e8;

//                     curr[j]=Math.min(up,left);
//                 }
//             }
//             prev=curr;
//         }
//         return prev[m-1];
//     }

//     int tell3(int [][]arr,int n,int m){
//         // tabulation
//         int dp[][]=new int[n][m];
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(i==0 && j==0) dp[0][0] = arr[0][0];
//                 else{
//                     int up=arr[i][j], left=arr[i][j];
//                     if(i-1>=0) up+= dp[i-1][j];
//                     else up += (int)1e8;
//                     if(j-1>=0) left += dp[i][j-1];
//                     else left += (int) 1e8;

//                     dp[i][j]=Math.min(up,left);
//                 }
//             }
//         }
//         return dp[n-1][m-1];
//     }

//     int tell2(int i,int j ,int n,int m,int [][]arr,int [][]dp){
//         // memoization
//         if(i==0 && j==0){
//             return arr[i][0];
//         }
//         if(i<0 || j<0) return (int)1e8;
//         if(dp[i][j]!=-1) return dp[i][j];

//         int up = arr[i][j] + tell(i-1,j,n,m,arr);
//         int left = arr[i][j] + tell(i,j-1,n,m,arr);

//         return dp[i][j]=Math.min(up,left);
//     }

//     int tell(int i,int j ,int n,int m,int [][]arr){
//         // recursion
//         if(i==0 && j==0){
//             return arr[i][0];
//         }
//         if(i<0 || j<0) return (int)1e8;

//         int up = arr[i][j] + tell(i-1,j,n,m,arr);
//         int left = arr[i][j] + tell(i,j-1,n,m,arr);

//         return Math.min(up,left);
//     }
// }