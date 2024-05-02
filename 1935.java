// // 1935. Maximum Number of Words You Can Type

// class Solution {
//     public int canBeTypedWords(String text, String brokenLetters) {
//         String arr[]= text.split(" ");
//         int ans =0 ;
//         for(String s : arr){
//             boolean flag = false;
//             for(int i=0;i<brokenLetters.length();i++){
//                 if( s.contains( ""+brokenLetters.charAt(i) ) ){
//                     flag = true;
//                     continue;
//                 }
//             }
//             if(flag==false) ans++;
//         }
//         return ans;
//     }
// }