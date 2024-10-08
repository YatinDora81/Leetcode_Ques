// // 322. Coin Change


// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int dp[] = new int[amount+1];
//         Arrays.fill(dp,-1);
//         int ans = solve2( coins , amount );

//         if(ans==Integer.MAX_VALUE) return -1;
//         return  ans;
//     }

//     int solve2(int arr[] , int K){
//         // tabulation
//         int dp[] = new int[K+1];
//         Arrays.fill(dp,Integer.MAX_VALUE);

//         dp[0] = 0;

//         for(int k = 1 ; k<=K ; k++ ){
//             int ans = Integer.MAX_VALUE;

//             for(int i=0;i<arr.length;i++){
//                 if( k-arr[i]>=0 && dp[k-arr[i]]!=Integer.MAX_VALUE ){
//                     int c = dp[k - arr[i]];

//                     if(c!=Integer.MAX_VALUE){
//                         ans=Math.min( c+1 , ans);
//                     }
//                 }
//             }
//             dp[k] = ans;
//         }

//         return dp[K];
//     }

//     int solve(int[] arr , int k,int []dp){
//         if(k==0) return 0;
//         if(k<0) return Integer.MAX_VALUE;
//         if(dp[k]!=-1) return dp[k];
//         int ans = Integer.MAX_VALUE;

//         for(int i=0;i<arr.length;i++){
//             int c = solve( arr , k - arr[i] ,dp );

//             if(c!=Integer.MAX_VALUE){
//                 ans=Math.min( c+1 , ans);
//             }
//         }
//         return dp[k] = ans;
//     }
// }