// // 1598. Crawler Log Folder

// class Solution {
//     public int minOperations(String[] arr) {
//         int ans = 0;
//         for(String s : arr){
//             if( s.equals("../") ) ans = Math.max(0 , ans-1);
//             else if(s.equals("./")) continue;
//             else ans++;
//         }
//         return ans;
//     }
// }