// // 1629. Slowest Key

// class Solution {
//     public char slowestKey(int[] arr, String s) {

//         char ans = 'A';
//         int v = 0;
//         for( int i = 0 ;i<arr.length ; i++ ){
//             if( i==0 ){
//                 v = arr[0];
//                 ans = s.charAt(i);
//             }
//             else{
//                 int val = arr[i] - arr[i-1];
//                 if( val>v || (val==v && ans<s.charAt(i)) ){
//                     v = val;
//                     ans = s.charAt(i);
//                 }
//             }
//         }
//         return ans; 
//     }
// }