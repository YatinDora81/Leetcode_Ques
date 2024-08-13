// // 2679. Sum in a Matrix

// class Solution {
//     public int matrixSum(int[][] nums) {
//         List<List<Integer>> ll = new ArrayList<>();

//         for(int i=0;i<nums.length;i++){
//             List<Integer> ds = new ArrayList<>();
//             for(int j=0;j<nums[0].length;j++){
//                 ds.add(nums[i][j]);
//             }
//             ll.add(ds);
//         }

//         int ans=0;

//         for(int t=0;t<nums[0].length;t++){
//             List<Integer> ds = new ArrayList<>();
//             for(int i=0;i<ll.size();i++){
//                 int ind = tell(ll.get(i));
//                 ds.add(ll.get(i).get(ind));
//                 ll.get(i).remove(ind);
//             }
//             Collections.sort(ds);
//             ans += ds.get(ds.size()-1);
//         }
//         return ans;
//     }

//     int tell(List<Integer> ll){
//         int ind = 0;
//         for(int i=1;i<ll.size();i++){
//             if(ll.get(i)>ll.get(ind)) ind = i;
//         }
//         return ind;
//     }
// }