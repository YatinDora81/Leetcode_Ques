// // 1137. N-th Tribonacci Number

// public int tell(int n){
//     // //recursion
//     if(n==0) return 0;
//     if(n==1) return 1;
//     if(n==2) return 1;

//     return tell(n-1) + tell(n-2) + tell(n-3);
// }

// public int tell(int n,int []dp){
//     //memoization
//     if(n==0) return 0;
//     if(n==1) return 1;
//     if(n==2) return 1;
//     if(dp[n]!=-1) return dp[n];
//     return dp[n]=tell(n-1,dp) + tell(n-2,dp) + tell(n-3,dp);
// }

// public int tell(int n,int []dp){
//     //tabulation
//     if(n==0) return 0;
//     if(n<=2) return 1;
//     dp[0]=0;
//     dp[1]=1;
//     dp[2]=1;
//     for(int i=3;i<=n;i++){
//         dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
//     }
//     return dp[n];
// }

// public int tell(int n){
//     //most optimized
//     int prev3=0;
//     int prev2=1;
//     int prev=1;
//     for(int i=3;i<=n;i++){
//         int curri=prev+prev2+prev3;
//         prev3=prev2;
//         prev2=prev;
//         prev=curri;
//     }
//     return prev;
// }