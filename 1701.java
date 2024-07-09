// // 1701. Average Waiting Time

// class Solution {
//     public double averageWaitingTime(int[][] cust) {
//         double ans = 0;
//         int t = 0;
//         for(int i=0;i<cust.length;i++){
//             if( t<cust[i][0] ) t = cust[i][0];
//             int comptime = t + cust[i][1];
//             ans += comptime - cust[i][0];
//             t = comptime;
//         }


//         return ans/(double)cust.length;
//     }
// }