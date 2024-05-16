// // 2500. Delete Greatest Value in Each Row

// class Solution {
//     public int deleteGreatestValue(int[][] grid) {
//         List<List<Integer>> arr = new ArrayList<>();
//         for(int i[] : grid){
//             List<Integer> ll=new ArrayList<>();
//             for(int j : i){
//                 ll.add(j);
//             }
//             Collections.sort(ll);
//             arr.add(ll);
//         }

//         int ans=0;
//         for(int i=0;i<arr.get(0).size();i++){
//             int c=0;
//             for(int j=0;j<arr.size();j++){
//                 c= Math.max(c,arr.get(j).get(i));
//             }
//             ans += c;
//         }
//         return ans;
//     }
// }