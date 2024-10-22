// // 2506. Count Pairs Of Similar Strings

// class Solution {
//     public int similarPairs(String[] words) {
//         HashMap<String,Integer> hm = new HashMap<>();
//         int c = 0;
//         for(int i=words.length-1;i>=0;i--){
//             TreeSet<Character> set = new TreeSet<>();
//             for(char ch : words[i].toCharArray()) set.add(ch);
//             StringBuilder sb = new StringBuilder("");
//             for(char ch : set ) sb.append(ch);
//             // int hv = sb.toString().hashCode();
//             if(hm.containsKey(sb.toString())){
//                 c += hm.get(sb.toString());
//                 hm.put(sb.toString() , hm.get(sb.toString())+1);
//             }
//             else hm.put(sb.toString(),1);
//         }
//         return c;
//     }
// }