// // 2032. Two Out of Three

// class Solution {
//     public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
//         HashSet<Integer> set=new HashSet<>();
//         HashSet<Integer> set2=new HashSet<>();
//         HashSet<Integer> a=new HashSet<>();
//         for(int i : nums1) set.add(i);
//         for(int i:nums2){
//             if(set.contains(i)) a.add(i);
//             set2.add(i);
//         }
//         for(int i:nums3){
//             if(set.contains(i) || set2.contains(i)) a.add(i);
//             // set.add(i);
//         }
//         List<Integer> ans=new ArrayList<>(a);

//         return ans;
//     }
// }