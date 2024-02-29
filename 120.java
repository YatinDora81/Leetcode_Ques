// // 120. Triangle
// class Solution {
//     public int minimumTotal(List<List<Integer>> ll) {
//         int n= ll.size();
//         int ans = tell4(n,ll);
//         return ans;
//     }

//     int tell4(int n,List<List<Integer>> ll){
//         // space optimization
//         int front[]=new int[n];
//         for(int i=0;i<n;i++){
//             front[i] = ll.get(n-1).get(i);
//         }

//         for(int i=n-2;i>=0;i--){
//             int curr[]=new int[n];
//             for(int j = i;j>=0;j--){
//                 int  d = ll.get(i).get(j) + front[j];
//                 int dg = ll.get(i).get(j) + front[j+1];
//                 curr[j] = Math.min(d,dg);
//             }
//             front=curr;
//         }

//         return front[0];
//     }

//     int tell3(int n,List<List<Integer>> ll){
//         // tabulation
//         int dp[][]=new int[n][n];
//         for(int i=0;i<n;i++){
//             dp[n-1][i] = ll.get(n-1).get(i);
//         }

//         for(int i=n-2;i>=0;i--){
//             for(int j = i;j>=0;j--){
//                 int  d = ll.get(i).get(j) + dp[i+1][j];
//                 int dg = ll.get(i).get(j) + dp[i+1][j+1];
//                 dp[i][j] = Math.min(d,dg);
//             }
//         }

//         return dp[0][0];
//     }

//     int tell2(int i,int j,int n,List<List<Integer>> ll , int [][]dp){
//         // memoization
//         if(i==n-1){
//             return ll.get(i).get(j);
//         }
//         if(dp[i][j]!=-1) return dp[i][j]; 

//         int  d = ll.get(i).get(j) + tell2(i+1 , j ,n ,ll,dp);
//         int dg = ll.get(i).get(j) + tell2(i+1,j+1,n,ll,dp);

//         return dp[i][j] = Math.min(d,dg);
//     }

//     int tell(int i,int j,int n,List<List<Integer>> ll){
//         // recursion
//         if(i==n-1){
//             return ll.get(i).get(j);
//         }

//         int  d = ll.get(i).get(j) + tell(i+1 , j ,n ,ll);
//         int dg = ll.get(i).get(j) + tell(i+1,j+1,n,ll);

//         return Math.min(d,dg);
//     }
// }