// class Solution {
//     public int[] transformArray(int[] nums) {
//         if(nums.length<=1){
//             nums[0] = nums[0]%2==0 ? 0 : 1;
//             return nums;
//         }
//         int i = 0 , j = nums.length-1;
//         while(i<=j){
//             while( i<=j && i<nums.length && nums[i]%2==0){
//                 nums[i++] = 0;
//             }
//             if(i>j) return nums;
//             while( j>=0 && i<=j && nums[j]%2!=0){
//                 nums[j--] = 1;
//             }
//             if(i>j) return nums;
//             nums[i++] = 0;
//             nums[j--] = 1;
//         }
//         return nums;
//     }
// }