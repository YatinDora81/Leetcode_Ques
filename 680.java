// // 680. Valid Palindrome II

// class Solution {
//     public boolean validPalindrome(String s) {
//         int i = 0 , j = s.length()-1 ;
//         while(i<j){
//             if( s.charAt(i) == s.charAt(j) ){
//                 i++;
//                 j--;
//             }
//             else{
//                 StringBuilder sb1 = new StringBuilder(s);
//                 StringBuilder sb2 = new StringBuilder(s);
//                 sb1.deleteCharAt(i);
//                 sb2.deleteCharAt(j);
//                 return is(sb1.toString()) || is(sb2.toString());
//             }
//         }
//         return true;
//     }

//     boolean is(String s){
//         int i = 0 , j = s.length()-1 ;
//         while(i<j){
//             if( s.charAt(i) == s.charAt(j) ){
//                 i++;
//                 j--;
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
//     }
// }