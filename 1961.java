// // 1961. Check If String Is a Prefix of Array

// class Solution {
//     public boolean isPrefixString(String s, String[] words) {
//         StringBuilder sb = new StringBuilder("");
//         for(String ss : words){
//             if(sb.length()<s.length()){
//                 if(!s.contains(ss)) return false;
//                 else sb.append(ss);
//             }else break;
//         }
//         if(sb.toString().equals(s)) return true;
//         return false;
//     }
// }