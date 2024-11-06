// // 3011. Find if Array Can Be Sorted

// class Solution {
//     public boolean canSortArray(int[] nums) {
//         // first pass maximum value to its right pos
//         for(int i=0;i<nums.length-1;i++){
//             if( nums[i]<=nums[i+1] ) continue;
//             else if(Integer.bitCount(nums[i]) == Integer.bitCount(nums[i+1]) ){
//                 int t = nums[i];
//                 nums[i] = nums[i+1];
//                 nums[i+1] = t;
//                 i--;
//             }
//             else return false;
//         }
        
//         // System.out.println(Arrays.toString(nums));
//         // for(int i : nums) System.out.print( Integer.bitCount(i) );
//         // System.out.println();

//         // second pass min value to its left pos
//         for(int i=nums.length-1 ; i>=1 ; i--){
//             if(nums[i]>=nums[i-1]) continue;
//             else if(Integer.bitCount(nums[i]) == Integer.bitCount(nums[i-1]) ){
//                 int t = nums[i];
//                 nums[i] = nums[i-1];
//                 nums[i-1] = t;
//                 i++;
                
//             }
//             else return false;
//         }
//         // System.out.println(Arrays.toString(nums));

//         return true;
//     }
// }




// // class Solution {
// //     public boolean canSortArray(int[] nums) {
// //         while( true ){
// //             boolean isSwap = false;
// //             for(int i=0;i<nums.length-1;i++){
// //                 if(nums[i]>nums[i+1] && Integer.bitCount(nums[i]) == Integer.bitCount(nums[i+1]) ){
// //                     isSwap = true;
// //                     int t = nums[i];
// //                     nums[i] = nums[i+1];
// //                     nums[i+1] = t;
// //                 }
// //             }
// //             if(!isSwap) break;
// //         }
// //         for(int i=1;i<nums.length;i++){
// //             if(nums[i-1]>nums[i]) return false;
// //         }
// //         return true;
// //     }
// // }