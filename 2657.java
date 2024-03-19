// // 2657. Find the Prefix Common Array of Two Arrays

// class Solution {
//     public int[] findThePrefixCommonArray(int[] nums1, int[] nums2) {
//         HashSet<Integer> set1=new HashSet<>();
//         HashSet<Integer> set2=new HashSet<>();
//         int ans[]=new int[nums1.length];

//         for(int i=0;i<ans.length;i++){
//             int c=0;
//             set1.add(nums1[i]);
//             set2.add(nums2[i]);
//             for(int ele : set1){
//                 if(set2.contains(ele)) c++;
//             }
//             ans[i] = c;
//         }
//         return ans;

//     }
// }
