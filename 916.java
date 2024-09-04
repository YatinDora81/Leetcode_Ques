// // 916. Word Subsets

// class Solution {
//     public List<String> wordSubsets(String[] words1, String[] words2) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         List<String> ans = new ArrayList<>();
        
//         for(String s  : words2){
//             HashMap<Character,Integer> temp = new HashMap<>();
//             for(char ch : s.toCharArray()){
//                 if(temp.containsKey(ch)) temp.put(ch , temp.get(ch)+1);
//                 else temp.put(ch  , 1);
//             }
//             for(char ch : temp.keySet()){
//                 if(!map.containsKey(ch) ) map.put(ch , temp.get(ch));
//                 else if( map.get(ch)<temp.get(ch) ) map.put(ch , temp.get(ch) );
//             }
//         }

//         // System.out.print(map);
//         for(String s : words1){
//             HashMap<Character,Integer> temp = new HashMap<>();
//             for(char ch : s.toCharArray()){
//                 if(temp.containsKey(ch)) temp.put(ch , temp.get(ch)+1);
//                 else temp.put(ch  , 1);
//             }
//             boolean f = true;
//             for(char ch : map.keySet()){
//                 if(!temp.containsKey(ch) || temp.get(ch)<map.get(ch) ){
//                     f = false;
//                     // System.out.println(s + " " + ch  + " "+  map + " " + temp);
//                     break;
//                 }
//             }
//             if(f) ans.add(s);
//         }
        
//         return ans;
//     }
//     boolean is(String s1 , String s2){
//         if(s1.contains(s2)) return true;
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(char ch : s1.toCharArray()){
//             if(map.containsKey(ch)) map.put(ch , map.get(ch)+1);
//             else map.put(ch  , 1);
//         }
//         for(char ch : s2.toCharArray()){
//             if( !map.containsKey(ch) ) return false;
//             else if( map.get(ch)==1 ) map.remove(ch);
//             else map.put( ch , map.get(ch)-1 );
//         }

//         return true;
//     }
// }