// // 2180. Count Integers With Even Digit Sum

// class Solution {
//     public int countEven(int num) {
//         int ans =0;
//         for(int i=2;i<=num;i++){
//             if(iseven(i+"")) ans++;
//         }
//         return ans;
//     }
//     boolean iseven(String num){
//         String arr[] = num.trim().split("");
//         int ans =0;
//         for(String s : arr) ans += Integer.parseInt(s);
//         return ans%2==0;
//     }
// }