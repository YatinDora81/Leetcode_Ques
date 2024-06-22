// // 2186. Minimum Number of Steps to Make Two Strings Anagram II

// class Solution {
//     public int minSteps(String s, String t) {
//         int freq[] = new int[26];
//         for(char ch : s.toCharArray()){
//             int ind = ch-'a';
//             freq[ind]+=1;
//         }
//         int c=0;
//         for(char ch : t.toCharArray()){
//             int ind = ch-'a';
//             if(freq[ind]>0){
//                 c+=2;
//                 freq[ind]-=1;
//             }
//         }
//         return s.length()+t.length()-c;
//     }
// }