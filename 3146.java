// // 3146. Permutation Difference between Two Strings

// class Solution {
//     public int findPermutationDifference(String s, String t) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             map.put(s.charAt(i),i);
//         }
//         int ans=0;
//         for(int i=0;i<t.length();i++){
//             map.put(t.charAt(i), Math.abs( map.get(t.charAt(i)) - i ) );
//             ans += map.get(t.charAt(i));
//         }
//         return ans;
//     }
// }