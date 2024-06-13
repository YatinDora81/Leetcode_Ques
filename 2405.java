// // 2405. Optimal Partition of String

// class Solution {
//     public int partitionString(String s) {
//         int ans = 0;
//         HashSet<Character> set = new HashSet<>();
//         for( char ch : s.toCharArray() ){
//             if(set.contains(ch)){
//                 set = new HashSet<>();
//                 ans++;
//                 set.add(ch);
//             }
//             else set.add(ch);
//         }
//         if(set.size()>0) ans++;
//         return ans;
//     }
// }