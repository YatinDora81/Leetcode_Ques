// // 3210. Find the Encrypted String

// class Solution {
//     public String getEncryptedString(String s, int k) {
//         StringBuilder sb = new StringBuilder(s);
//         for(int i=0;i<s.length();i++){
//             sb.setCharAt(i , s.charAt((i+k)%s.length()) );
//         }
//         return sb.toString();
//     }
// }