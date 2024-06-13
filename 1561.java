// // 1561. Maximum Number of Coins You Can Get

// class Solution {
//     public int maxCoins(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length/3 , ans = 0;
//         int j = nums.length-2;
//         for(int i=0;i<n;i++){
//             ans += nums[j];
//             j-=2;
//         }
//         return ans;
//     }
// }