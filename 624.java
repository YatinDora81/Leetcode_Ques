// // 624. Maximum Distance in Arrays

// class Solution {
//     public int maxDistance(List<List<Integer>> ll) {
//         int s = ll.get(0).get(0);
//         int e = ll.get(0).get(ll.get(0).size()-1);
//         int maxi = Integer.MIN_VALUE;
//         for(int i=1;i<ll.size();i++){
//             maxi = Math.max(maxi , Math.max( Math.abs(ll.get(i).get(0)-e) , Math.abs(ll.get(i).get(ll.get(i).size()-1)-s) ) );
//             s = Math.min(s,ll.get(i).get(0));
//             e = Math.max(e , ll.get(i).get(ll.get(i).size()-1));
//         }
//         return maxi;
//     }
// }