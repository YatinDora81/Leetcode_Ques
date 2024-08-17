// // 3194. Minimum Average of Smallest and Largest Elements

// class Solution {
//     public double minimumAverage(int[] nums) {
//         int i=0 , j = nums.length-1;
//         Arrays.sort(nums);
//         double mini = Integer.MAX_VALUE;
//         while(i<j){
//             double ans = (double)(nums[i] + nums[j]) / (double)2;
//             i++;j--;
//             mini = Math.min(mini , ans);
//         }
//         return mini;
//     }
// }