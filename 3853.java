// class Solution {
//     public String mergeCharacters(String s, int k) {
//         StringBuilder sb = new StringBuilder(s);
//         for(int i=0;i<sb.length();i++){
//             for(int j=1;j<=k;j++){
//                 if(i+j>=sb.length()) break;
//                 if(sb.charAt(i)==sb.charAt(i+j)){
//                     sb.deleteCharAt(i+j);
//                     i = -1;
//                     break;
//                 }
//             }
//         }

//         return sb.toString();
//     }
// }