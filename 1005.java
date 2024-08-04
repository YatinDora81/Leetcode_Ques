// // 1005. Maximize Sum Of Array After K Negations

// class Solution {
//     public int largestSumAfterKNegations(int[] nums, int k) {
//         Arrays.sort(nums);
//         int cn = 0;
//         for(int i : nums){
//             if(i>=0) break;
//             if(i<0) cn++;
//         }
//         if(cn>=k){
//             for(int i=0;i<k;i++){
//                 nums[i] = nums[i] * -1;
//             }
//             // System.out.println(Arrays.toString(nums) + " " + cn);
//         }
//         else if(cn<k){
//             for(int i=0;i<cn;i++){
//                 nums[i] = nums[i] * -1;
//             }
//             if((k-cn)%2!=0){
//                 Arrays.sort(nums);
//                 nums[0] =  nums[0] * -1;
//             }
//         }
//         else if(cn==0){
//             if(k%2!=0){
//                 nums[0] =  nums[0] * -1;
//             }
//         }
//         int sum =0;
//         for(int i : nums) sum += i;
//         return sum;
//     }
// }