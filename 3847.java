// class Solution {
//     public int scoreDifference(int[] nums) {
//         boolean is = true;
//         int c1 = 0 , c2 = 0;
//         for(int i=0;i<nums.length;i++){
//             if( ((i+1)%6==0 && !(nums[i]%2==1)) || (!((i+1)%6==0) && nums[i]%2==1) ){
//                 is = !is;
//                 if(is) c1 += nums[i];
//                 else c2 += nums[i];
//             }else{
//                 if(is) c1 += nums[i];
//                 else c2 += nums[i];
//             }
//         }
//         return c1 - c2;
//     }
// }