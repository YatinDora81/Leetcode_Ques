// // 1742. Maximum Number of Balls in a Box

// class Solution {
//     public int countBalls(int lowLimit, int highLimit) {
//         int arr[] = new int[10000];
//         int ans = 0;
//         for(int i=lowLimit ; i<=highLimit ; i++){
//             int ind = tell( (i+"").split("") );
//             arr[ind] += 1;
//             ans = Math.max(ans , arr[ind]);
//         }
//         return ans;

//     }
//         int tell(String [] arr){
//             int ans = 0;
//             for(String s  : arr) ans += Integer.parseInt(s);
//             return ans;
//         }
// }