// class Solution {
//     public double myPow(double x, int n) {
//         if(n<0){
//             x = 1 / x;
//             n = n * -1;
//         }
//         // double dp[][] = new double[x+1][n+1];
//         return solve(x , n );
//     }
//     public double solve( double x , int n ){
//         if(n==0) return 1;
//         if(n==1) return x;
//         double ans = 0;
//         if(n%2!=0) ans = x;
//         double d =  solve(x , n/2);
//         ans = ( d * d  ) * ((ans==0) ? 1 : ans);
//         return ans;
//     }
// }