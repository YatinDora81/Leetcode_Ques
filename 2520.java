// // 2520. Count the Digits That Divide a Number

// class Solution {
//     public int countDigits(int num) {
//         String arr[] = (num+"").trim().split("");
//         int c =0 ;
//         for(int i=0;i<arr.length;i++) if( num%(Integer.parseInt(arr[i])) ==0 ) c++;
//         return c;
//     }
// }