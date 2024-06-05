// // 1002. Find Common Characters

// class Solution {
//     public List<String> commonChars(String[] words) {
//         List<String> ll=new ArrayList<>();
//         if(words.length==1){
//             for(char ch  : words[0].toCharArray()) ll.add(ch+"");
//             return ll;
//         }
//         String cmp = words[0];
//         for(int i=1;i<words.length;i++) cmp = tell(cmp , words[i]);
//         for(char ch : cmp.toCharArray()) ll.add(ch + "");
//         return ll;
//     }
//     String tell(String s1,String s2){
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(char ch : s1.toCharArray()){
//             if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
//             else map.put(ch,1);
//         }
//         StringBuilder sb=new StringBuilder();
//         for(char ch : s2.toCharArray()){
//             if( map.containsKey(ch) ){
//                 if( map.get(ch)==1 ) map.remove(ch);
//                 else map.put(ch,map.get(ch)-1);
//                 sb.append(ch);
//             }
//         }
//         return sb.toString();
//     }
// }