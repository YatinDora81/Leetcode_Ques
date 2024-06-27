// // 1791. Find Center of Star Graph

// class Solution {
//     public int findCenter(int[][] edges) {
//         HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
//         for(int nums[] : edges){
//             if(!map.containsKey(nums[0])) map.put(nums[0] , new HashSet<>());
//             if(!map.containsKey(nums[1])) map.put(nums[1] , new HashSet<>());
//             map.get(nums[0]).add(nums[1]);
//             map.get(nums[1]).add(nums[0]);
//         }
//         // System.out.print(map);
//         for(int i : map.keySet()){
//             if(map.get(i).size() == edges.length ) return i;
//         }
//         return 0;
//     }
// }