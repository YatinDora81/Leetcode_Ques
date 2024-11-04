// // 482. License Key Formatting

// class Solution {
//     public String licenseKeyFormatting(String s, int k) {
//         StringBuilder sb = new StringBuilder("");
//         int dash = 0;
//         for(int i=s.length()-1;i>=0;i--){
//             if(s.charAt(i)!='-'){
//                 sb.insert( 0 , (s.charAt(i)+"").toUpperCase());
//                 if((sb.length()-dash)%k==0){
//                     sb.insert( 0 , "-" );
//                     dash++;
//                 }
//             }
//         }
//         if(sb.length()>0 && sb.charAt(0)=='-') sb.deleteCharAt(0);
//         return sb.toString();
//     }
// }