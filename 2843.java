// // 2843. Count Symmetric Integers

// class Solution {
//     public int countSymmetricIntegers(int low, int high) {
//         int c = 0;
//         for(int i=low;i<=high;i++){
//             String s = "" + i;
//             if(s.length()%2!=0) continue;
//             else{
//                 int a =0 , b=0;
//                 for(int j=0;j<s.length()/2;j++){
//                     a += Integer.parseInt(s.charAt(j) + "");
//                     b += Integer.parseInt(s.charAt(s.length()-1-j) + "");
//                 }
//                 if(a==b && a!=0 ) c++;
//             }
//         }
//         return c;
//     }
// }