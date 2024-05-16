// // 1624. Largest Substring Between Two Equal Characters

// class Solution {
//     public int maxLengthBetweenEqualCharacters(String s) {
//         HashMap<Character,List<Integer>> map=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             if(map.containsKey(s.charAt(i))) map.get( s.charAt(i) ).add(i);
//             else {
//                 map.put( s.charAt(i),new ArrayList<>() );
//                 map.get(s.charAt(i)).add(i);
//             }
//         }

//         // System.out.print(map);
//         int ans=-1;

//         for(char ch : map.keySet()){
//             if(map.get(ch).size()>1){
//                 ans = Math.max(ans , map.get(ch).get( map.get(ch).size()-1 ) - map.get(ch).get(0) -1 );
//             }
//         }

//         return ans;
//     }
// }