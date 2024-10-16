// // 748. Shortest Completing Word

// class Solution {
//     public String shortestCompletingWord(String licensePlate, String[] words) {
//         Arrays.sort(words , (a,b)->{
//             if(a.length()-b.length()<0) return -1;
//             else if(a.length()-b.length()>0) return 1;
//             return 0;
//         });

//         for(int i=0;i<words.length;i++){
//             if( is(licensePlate.toLowerCase() , words[i].toLowerCase() ) ) return words[i];
//         }

//         return "";
//         // return Arrays.toString(words);
//     }

//     public boolean is(String s1,String s2){
//         HashMap<Character,Integer> map1 = new HashMap<>();
//         HashMap<Character,Integer> map2 = new HashMap<>();
//         for(char ch : s1.toCharArray()){
//             if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ){
//                 if(map1.containsKey(ch)) map1.put(ch, map1.get(ch)+1);
//                 else map1.put(ch , 1);
//             }
//         }

//         for(char ch : s2.toCharArray()){
//             if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ){
//                 if(map2.containsKey(ch)) map2.put(ch, map2.get(ch)+1);
//                 else map2.put(ch , 1);
//             }
//         }

//         // System.out.println(map1);
//         // System.out.println(map2);

//         for(char ch: map1.keySet()){
//             if( !map2.containsKey(ch) || map2.get(ch)<map1.get(ch) ) return false;
//         }
//         return true;
//     }
// }