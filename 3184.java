// // 3184. Count Pairs That Form a Complete Day I

// class Solution {
//     public int countCompleteDayPairs(int[] nums) {
//         int ans = 0;
//         for(int i=0;i<nums.length-1;i++) for(int j = i+1 ; j<nums.length;j++) if((nums[i]  + nums[j])%24 ==0 ) ans++;
//         return ans;
//     }
// }