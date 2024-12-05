// // 2287. Rearrange Characters to Make Target String

// class Solution {
//     public int rearrangeCharacters(String s, String target) {
//         HashMap<Character , Integer> map1 = new HashMap<>();
//         for(char ch : s.toCharArray() ){
//             if(map1.containsKey(ch)) map1.put(ch , map1.get(ch)+1);
//             else map1.put(ch,1);
//         }
//         HashMap<Character , Integer> map2 = new HashMap<>();
//         for(char ch : target.toCharArray() ){
//             if(map2.containsKey(ch)) map2.put(ch , map2.get(ch)+1);
//             else map2.put(ch,1);
//         }

//         int ans = 0;
//         boolean flag = false;
//         // System.out.println(map1);
//         while(!flag){

//             for( char ch : map2.keySet() ){
//                 if( !map1.containsKey(ch) || map1.get(ch)<map2.get(ch) ) flag =true;
//                 else map1.put( ch  , map1.get(ch) - map2.get(ch) );
//             }
//             if(!flag) ans++;

//         }
        
//         return ans;
//     }
// }