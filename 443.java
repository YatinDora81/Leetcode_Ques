// // 443. String Compression

// class Solution {
//     public int compress(char[] chars) {
        
//         StringBuilder sb = new StringBuilder("");
//         for(char ch : chars) sb.append(ch);
//         String s= sb.toString();
//         sb = new StringBuilder("");
//         int i=0;
//         while(i<s.length()){
//             int c=1;
//             int j=i+1;
//             while(j<s.length() && s.charAt(i)==s.charAt(j)){
//                 c++;
//                 j++;
//             }

            
//             if(c>1) sb.append(s.charAt(i) +""+ c);
//             else sb.append(s.charAt(i));
//             i=j;
//         }
//         for(i=0; i<sb.length(); i++){
//             chars[i] = sb.charAt(i);
//         }
//         return sb.toString().length();
//     }
// }