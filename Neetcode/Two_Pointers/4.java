// class Solution {
//     public String mergeAlternately(String s, String t) {
//         int i=0, j=0, n = s.length() , m = t.length();
//         StringBuilder sb = new StringBuilder("");
//         while(i<n || j<m){
//             if(i<n) sb.append(s.charAt(i++));
//             if(j<m) sb.append(t.charAt(j++));
//         }
//         return sb.toString();
//     }
// }