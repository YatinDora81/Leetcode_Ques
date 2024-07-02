// // 1370. Increasing Decreasing String.

// class Solution {
//     public String sortString(String s) {
//         StringBuilder ans = new StringBuilder();
//         TreeMap<Character,Integer> map = new TreeMap<>();
//         for(char i : s.toCharArray()){
//             if(map.containsKey(i)) map.put(i,map.get(i)+1);
//             else map.put(i,1);
//         }
//         boolean f = true;
//         while(ans.length()<s.length()){
//             StringBuilder sb = new StringBuilder();
//             for(char ch : map.keySet()){
//                 sb.append(ch);
//             }
//             for(char ch : sb.toString().toCharArray()){
//                 if(map.get(ch)==1) map.remove(ch);
//                 else map.put(ch,map.get(ch)-1);
//             }
//             if(f) ans.append(sb.toString());
//             else ans.append(sb.reverse().toString());
//             f=!f;
//         }
//         return ans.toString();
//     }
// }