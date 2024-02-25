// // 62. Unique Paths

// class Solution {
//     int mod= 2* (int)1e+9;
//     public int uniquePaths(int n, int m) {
//         // int dp[][]=new int[n][m];
//         // for(int a[] : dp){
//         //     Arrays.fill(a,-1);
//         // }
//         // int ans = tell(n-1,m-1,n,m,dp);
//         // int ans2 = tell2(n,m);
//         int ans3= tell3(n,m);
//         return ans3;
//     }

//     int tell3(int n,int m){
//         //space optimization
//         int prev[]=new int[m];

//         prev[0]=1;

//         for(int i=0;i<n;i++){
//             int curr[] = new int[m];
//             for(int j=0;j<m;j++){
//                 if(i==0 && j==0 ) curr[j]=1;
//                 else{
//                     int up=0,left=0;
//                     if(i-1>=0) up += prev[j];
//                     if(j-1>=0) left += curr[j-1];

//                     curr[j]=(up+left)%mod;
//                 }
//             }
//             prev=curr;
//         }


//         return prev[m-1];
//     }

//     int tell2(int n,int m){
//         //tabulation
//         int dp[][]=new int[n][m];

//         dp[0][0]=1;

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(i==0 && j==0 ) dp[i][j]=1;
//                 else{
//                     int up=0,left=0;
//                     if(i-1>=0) up += dp[i-1][j];
//                     if(j-1>=0) left += dp[i][j-1];

//                     dp[i][j]=(up+left)%mod;
//                 }
//             }
//         }


//         return dp[n-1][m-1];
//     }

//     int tell(int i,int j,int n,int m,int dp[][]){
//         //memoization
//         if(i==0 && j==0) return 1;
//         if(i<0 || j<0 ) return 0;
//         if(dp[i][j]!=-1) return dp[i][j];

//         int up = tell(i-1,j,n,m,dp);
//         int left = tell(i,j-1,n,m,dp);

//         return dp[i][j]=(up+left)%mod;
//     }
// }