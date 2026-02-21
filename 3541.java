// class Solution {
//     public int maxFreqSum(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(char ch : s.toCharArray()){
//             if(!map.containsKey(ch)) map.put(ch,0);
//             map.put(ch , map.get(ch)+1);
//         }
//         int c1 = 0;
//         int c2 = 0;

//         for(char ch : map.keySet()){
//             if(is(ch)) c1 = Math.max(c1 , map.get(ch));
//             else c2 = Math.max(c2 , map.get(ch));
//         }
//         return c1 + c2;
//     }
//     public boolean is(Character ch){
//         return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
//     }
// }