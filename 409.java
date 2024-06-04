// // 409. Longest Palindrome

// class Solution {
//     public int longestPalindrome(String s) {
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(char ch : s.toCharArray() ){
//             if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
//             else map.put(ch,1);
//         }
//         boolean odd = false;
//         int ans=0;
//         for(char ch : map.keySet()){
//             if(odd==false && map.get(ch)%2!=0 ){
//                 odd = true;
//                 ans += map.get(ch);
//             }
//             else if(map.get(ch)%2!=0) ans += map.get(ch)-1;
//             else ans += map.get(ch);
//         }
//         return ans;
//     }
// }