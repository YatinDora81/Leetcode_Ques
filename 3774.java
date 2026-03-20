// class Solution {
//     public int absDifference(int[] nums, int k) {
//         Arrays.sort(nums);
//         int ans = 0;
//         for(int i=nums.length-1;i>=nums.length-k;i--) ans+=nums[i];
//         for(int i=0;i<k;i++) ans-=nums[i];
//         return ans;
//     }
// }