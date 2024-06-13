// // 2037. Minimum Number of Moves to Seat Everyone

// class Solution {
//     public int minMovesToSeat(int[] arr1, int[] arr2) {
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         int ans=0;
//         for(int i=0;i<arr1.length;i++){
//             ans += Math.abs(arr1[i]-arr2[i]);
//         }
//         return ans;
//     }
// }