// class Solution {
//     public boolean canBeEqual(String s1, String s2) {
//         HashMap<Character,HashMap<Boolean,Integer>> map = new HashMap<>();
//         for(int i=0;i<s1.length();i++){
//             char ch = s1.charAt(i);
//             boolean is = i%2==0;
//             if(!map.containsKey(ch)) map.put(ch,new HashMap<>());
//             if(!map.get(ch).containsKey(is)) map.get(ch).put(is , 0);
//             map.get(ch).put(is , map.get(ch).get(is) + 1);
//         }
        
//         for(int i=0;i<s2.length();i++){
//             char ch = s2.charAt(i);
//             boolean is = i%2==0;
//             if(!map.containsKey(ch) || !map.get(ch).containsKey(is) || map.get(ch).get(is)<=0) return false;
//             map.get(ch).put(is , map.get(ch).get(is) - 1);
//         }
//         return true;
//     }
// }