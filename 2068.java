// // 2068. Check Whether Two Strings are Almost Equivalent

// class Solution {
//     public boolean checkAlmostEquivalent(String word1, String word2) {
//         HashMap<Character,Integer> map1=new HashMap<>();
//         for( char ch : word1.toCharArray()){
//             if(map1.containsKey(ch)) map1.put(ch,map1.get(ch)+1);
//             else map1.put(ch,1);
//         }

//         HashMap<Character,Integer> map2=new HashMap<>();
//         for( char ch : word2.toCharArray()){
//             if(map2.containsKey(ch)) map2.put(ch,map2.get(ch)+1);
//             else map2.put(ch,1);
//         }


//         return tell(map1,map2) && tell(map2,map1);
//     }

//     boolean tell(HashMap<Character,Integer> map1 , HashMap<Character,Integer> map2){

//         for( char ch : map1.keySet()){
//             int freq1= map1.get(ch);
//             int freq2=0;
//             if(map2.containsKey(ch)) freq2 = map2.get(ch);

//             if(Math.abs(freq1-freq2)>3) return false;
//         }

//         return true;
//     }
// }