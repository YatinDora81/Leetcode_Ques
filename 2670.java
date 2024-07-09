// // 2670. Find the Distinct Difference Array

// class Solution {
//     public int[] distinctDifferenceArray(int[] nums) {
//         int pref[] = new int[nums.length];
//         int suff[] = new int[nums.length];
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             set.add(nums[i]);
//             pref[i] = set.size();
//         }
//         set = new HashSet<>();
//         for(int i=nums.length-1;i>=0;i--){
//             suff[i] = set.size();
//             set.add(nums[i]);
//         }
//         int ans[] = new int[nums.length];
//         for(int i=0;i<nums.length;i++) ans[i] = pref[i] - suff[i];
//         return ans;
//     }
// }