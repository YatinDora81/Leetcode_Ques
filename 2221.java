// // 2221. Find Triangular Sum of an Array


// class Solution {
//     public int triangularSum(int[] nums) {
//         List<Integer> ll = new ArrayList<>();
//         for(int i : nums) ll.add(i);

//         while(ll.size()!=1){
//             List<Integer> ds = new ArrayList<>();
//             for(int i=1;i<ll.size();i++){
//                 ds.add((ll.get(i-1)+ll.get(i))%10);
//             }
//             ll = new ArrayList<>(ds);
//         }
//         return ll.get(0);
//     }
// }