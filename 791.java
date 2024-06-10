// // 791. Custom Sort String

// class Solution {
//     public String customSortString(String order, String s) {
//         TreeMap<Character,Integer> map = new TreeMap<>();
//         for(char ch : s.toCharArray()){
//             if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
//             else map.put(ch,1);
//         }
//         StringBuilder sb = new StringBuilder();
//         for(char ch : order.toCharArray()){
//             if( map.containsKey(ch) ){
//                 for(int i=0;i<map.get(ch);i++) sb.append(ch);
//                 map.remove(ch);
//             }
//         }
//         for(char ch : map.keySet()) for(int i=0;i<map.get(ch);i++) sb.append(ch);
//         return sb.toString();
//     }
// }