// // 3295. Report Spam Message

// class Solution {
//     public boolean reportSpam(String[] message, String[] bannedWords) {
//         HashMap<String,Integer> map = new HashMap<>();
//         for(String s : message){
//             if(map.containsKey(s)) map.put(s , map.get(s)+1);
//             else map.put(s,1);
//         }
//         int c = 0;
//         for(String s : bannedWords){
//             if( map.containsKey(s) ){
//                 c+=map.get(s);
//                 map.remove(s);
//             }
//             if(c>=2) return true;
//         }
//         return false;
//     }
// }