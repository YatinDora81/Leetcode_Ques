// // 806. Number of Lines To Write String

// class Solution {
//     public int[] numberOfLines(int[] nums, String s) {
//         int ans[] = {1,0};
//         int c = 0;
//         for(char ch : s.toCharArray()){
//             if( c + nums[ ch-'a' ] >100 ){
//                 c = nums[ch-'a'];
//                 ans[0]+=1;
//             }
//             else c+= nums[ch-'a'];
//         }

//         ans[1] = c;
//         return ans;
//     }
// }