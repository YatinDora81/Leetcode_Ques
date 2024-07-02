// // 350. Intersection of Two Arrays II

// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         List<Integer> ll = new ArrayList<>();
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i: nums1){
//             if(map.containsKey(i)) map.put(i,map.get(i)+1);
//             else map.put(i,1);
//         }
//         for(int i: nums2){
//             if(map.containsKey(i)){
//                 if(map.get(i)==1) map.remove(i);
//                 else map.put(i,map.get(i)-1);
//                 ll.add(i);
//             }
//         }

//         int ans[] = new int[ll.size()];
//         for(int i=0;i<ans.length;i++) ans[i] = ll.get(i);
//         return ans;
//     }
// }