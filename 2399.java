// // 2399. Check Distances Between Same Letters

// class Solution {
//     public boolean checkDistances(String s, int[] distance) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(map.containsKey(ch)){
//                 if(i-map.get(ch)-1!=distance[ch-'a'])
//                     return false;
//                 }
//             else map.put(ch,i);
//         }
//         return true;
//     }
// }