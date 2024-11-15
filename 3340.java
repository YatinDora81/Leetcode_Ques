// // 3340. Check Balanced String

// class Solution {
//     public boolean isBalanced(String num) {
//         int e = 0 , o = 0;
//         for(int i=0;i<num.length();i++){
//             if(i%2==0) e += Integer.parseInt(""+num.charAt(i));
//             else o += Integer.parseInt(""+num.charAt(i));
//         }
//         return e == o;
//     }
// }