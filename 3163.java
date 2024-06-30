// // 3163. String Compression III

// class Solution {
//     public String compressedString(String s) {
//         StringBuilder sb = new StringBuilder("");
//         int i=0;
//         while(i<s.length()){
//             int c=1;
//             int j=i+1;
//             while(j<s.length() && s.charAt(i)==s.charAt(j)){
//                 c++;
//                 j++;
//             }

//             while(c>9){
//                 sb.append("9" + s.charAt(i));
//                 c-=9;
//             }
//             if(c>0) sb.append(c + "" + s.charAt(i));
//             i=j;
//         }
//         return sb.toString();
//     }
// }