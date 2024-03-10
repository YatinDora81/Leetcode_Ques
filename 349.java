// // 349. Intersection of Two Arrays

// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         HashSet<Integer> set=new HashSet<>();
//         for(int i : nums1){
//             if(i==0) set.add(1111);
//             else set.add(i);   
//         }
//         for(int i : nums2){
//             if(i==0) set.add(-1111);
//             else set.add(-i);
//         }

//         List<Integer> ll =new ArrayList<>();
        
//         for( int i : nums1){
//             if(i==0 && set.contains(-1111) ){
//                 ll.add(0);
//                 set.remove(-1111);
//             }
//             else if(set.contains(-i)){
//                 ll.add(i);
//                 set.remove(-i);
//             }
//         }

//         int ans[]=new int[ll.size()];
//         for(int i =0 ; i<ll.size();i++){
//             ans[i]=ll.get(i);
//         }
//         return ans;
//     }
// }