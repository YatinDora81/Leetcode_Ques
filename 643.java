// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         double ans = -100000.0;
//         double curr = 0;
//         int i=0,j=0;
//         while(j<nums.length){
//             curr += nums[j];
//             if(j-i+1<k){
//                 j++;
//                 continue;
//             }
//             ans = Math.max(ans, curr / (double)k);
//             curr = curr - nums[i];
//             i++;j++;
//         }
//         return ans;
//     }
// }