// // 2427. Number of Common Factors

// class Solution {
//     public int commonFactors(int a, int b) {
//         int mini = (a<b) ? a : b;
//         int ans=0;
//         for(int i=1;i<=mini;i++) if(a%i==0 && b%i==0) ans++;
//         return ans;
//     }
// }