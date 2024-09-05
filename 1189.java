// // 1189. Maximum Number of Balloons

// class Solution {
//     public int maxNumberOfBalloons(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(char ch : s.toCharArray()){
//             if(map.containsKey(ch)) map.put(ch , map.get(ch)+1);
//             else map.put(ch , 1);
//         }
//         int ans = 0;
//         while(true){
//             String t = "balloon";
//             if( map.containsKey('b') && map.get('b')>=1 && map.containsKey('a') && map.get('a')>=1 && map.containsKey('l') && map.get('l')>=2 && map.containsKey('o') && map.get('o')>=2 && map.containsKey('n') && map.get('n')>=1 ){
//                 ans++;
//                 map.put('b' , map.get('b')-1);
//                 map.put('a' , map.get('a')-1);
//                 map.put('l' , map.get('l')-2);
//                 map.put('o' , map.get('o')-2);
//                 map.put('n' , map.get('n')-1);
//             }
//             else break;
//         }
//         return ans;
//     }
// }