// // 2486. Append Characters to String to Make Subsequence

// class Solution {
//     public int appendCharacters(String s, String t) {
//         int l=0;
//         for(int i=0;i<s.length();i++){
//             if(l>=t.length()) return 0;
//             if( s.charAt(i) == t.charAt(l) ) l++;
//         }
//         return t.length() - l;

//     }
// }