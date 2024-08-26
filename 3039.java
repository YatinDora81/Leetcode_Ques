// // 3039. Apply Operations to Make String Empty

// class Solution {
//     public String lastNonEmptyString(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(char ch : s.toCharArray()){
//             if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
//             else map.put(ch,1);
//         }
//         while( canDelete(map) ){
//             for(char ch : map.keySet()){
//                 map.put(ch , map.get(ch)-1);
//             }
//         }
//         StringBuilder sb = new StringBuilder("");
//         for(int i=s.length()-1;i>=0;i--){
//             if(map.get(s.charAt(i))==1){
//                 sb.append(s.charAt(i));
//                 map.put(s.charAt(i) , 0);
//             }
//         }
//         return sb.reverse().toString();
//     }

//     boolean canDelete(HashMap<Character,Integer> map){
//         for(char ch : map.keySet()){
//             if(map.get(ch)>1) return true;
//         }
//         return false;
//     }
// }