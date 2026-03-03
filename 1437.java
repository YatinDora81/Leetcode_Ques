// class Solution {
//     public boolean kLengthApart(int[] nums, int k) {
//         int prev = -1 ;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==1 && ((i-prev-1<k) && prev!=-1) ){
//                 // System.out.println(i + " " + prev);
//                 return false;
//             }
//             else if(nums[i]==1) prev = i;
//         }
//         return true;
//     }
// }