// // 1817. Finding the Users Active Minutes
// class Solution {
//     public int[] findingUsersActiveMinutes(int[][] logs, int k) {
//         int ans[] = new int[k];
//         HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
//         for(int i[] : logs){
//             if(!map.containsKey(i[0])) map.put(i[0] , new HashSet<>());
//             map.get(i[0]).add(i[1]);
//         }

//         for( int i : map.keySet() ){
//             int ind = map.get(i).size()-1;
//             ans[ind] += 1;
//         }

//         return ans;
//     }
// }