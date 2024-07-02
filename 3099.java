// // 3099. Harshad Number

// class Solution {
//     public int sumOfTheDigitsOfHarshadNumber(int x) {
//         char []arr = (x+"").toCharArray();
//         int a =0;
//         for(char ch : arr) a += Integer.parseInt(ch+"");
//         return (x%a==0) ? a : -1;
//     }
// }