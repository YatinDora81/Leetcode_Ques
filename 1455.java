// // 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence

// class Solution {
//     public int isPrefixOfWord(String s, String t) {
//         String arr[] = s.trim().split(" ");
//         for(int i=0;i<arr.length;i++){
//             if( arr[i].startsWith(t) ) return i+1;
//         }
//         return -1;
//     }
// }