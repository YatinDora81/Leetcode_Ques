// // 1160. Find Words That Can Be Formed by Characters

// class Solution {
//     public int countCharacters(String[] words, String chars) {
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(char ch : chars.toCharArray()){
//             if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
//             else map.put(ch,1);
//         }

//         int ans=0;

//         for(int i=0;i<words.length;i++){
//             String s = words[i];
//             HashMap<Character,Integer> temp=new HashMap<>();
//             for(char c : s.toCharArray()){
//                 if(temp.containsKey(c)) temp.put(c,temp.get(c)+1);
//                 else temp.put(c,1);
//             }
//             System.out.println(temp);
//             boolean f = true;
//             for(char c : temp.keySet()){
//                 if( !map.containsKey(c) || map.get(c)<temp.get(c) ) f=false;
//             }

//             if(f) ans += s.length();
//         }
//         return ans;
//     }
// }