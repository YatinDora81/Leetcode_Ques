// // 945. Minimum Increment to Make Array Unique
// class Solution {
//     public int minIncrementForUnique(int[] nums) {
//         Arrays.sort(nums);
//         int maxi =0 ;
//         int ans =0;

//         for(int i : nums){
//             maxi = Math.max(maxi , i);
//             ans = ans + maxi -i;
//             maxi++;
//         }
//         return ans;
//     }
// }