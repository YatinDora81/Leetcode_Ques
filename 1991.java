// // 1991. Find the Middle Index in Array

// class Solution {
//     public int findMiddleIndex(int[] nums) {
//         if(nums.length==1) return 0;
//         int pref[] = new int[nums.length];
//         int suff[] = new int[nums.length];
//         for(int i=1;i<nums.length;i++){
//             pref[i] = pref[i-1] + nums[i-1];
//         }
//         for(int i=nums.length-2;i>=0;i--){
//             suff[i] = suff[i+1] + nums[i+1];
//         }

//         for(int i=0;i<nums.length;i++) if( pref[i] == suff[i] ) return i;   

//         return -1;
//     }
// }