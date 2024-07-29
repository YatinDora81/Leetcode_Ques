// // 3232. Find if Digit Game Can Be Won

// class Solution {
//     public boolean canAliceWin(int[] nums) {
//         int c=0 , a=0 ,b=0;
//         for(int i : nums){
//             c+=i;
//             if( (""+i).length()==1 ) a+=i;
//             else if( (""+i).length()==2 ) b+=i;
//         }
//         if( a>c-a || b>c-b ) return true;
//         return false;
//     }
// }