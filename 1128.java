// // 1128. Number of Equivalent Domino Pairs

// class Solution {
//     public int numEquivDominoPairs(int[][] dominoes) {
//         HashMap<String,Integer> map = new HashMap<>();
//         for(int i[] : dominoes){
//             String s1 = i[0] + "-" + i[1];
//             String s2 = i[1] + "-" + i[0];
//             if(map.containsKey(s1)) map.put( s1 , map.get(s1)+1 );
//             else if(map.containsKey(s2)) map.put( s2 , map.get(s2)+1 );
//             else map.put(s1 , 0);
//         }
//         int ans = 0;
//         for(String i : map.keySet() ){
//             int n = map.get(i);
//             ans += n * (n+1) / 2;
//         }
//         return ans;
//     }
// }