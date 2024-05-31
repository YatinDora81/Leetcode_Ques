// // 2956. Find Common Elements Between Two Arrays

// class Solution {
//     public int[] findIntersectionValues(int[] nums1, int[] nums2) {
//         HashSet<Integer> set1=new HashSet<>();
//         HashSet<Integer> set2=new HashSet<>();
//         for(int i : nums1) set1.add(i);
//         for(int i : nums2) set2.add(i);

//         int ans[] = {0,0};
//         int a = 0,b=0;
//         for(int i=nums1.length-1;i>=0;i--){
//             if(set2.contains(nums1[i])) a++;
//         }
//         for(int i=nums2.length-1;i>=0;i--){
//             if(set1.contains(nums2[i])) b++;
//         }
//         ans[0] = a;
//         ans[1] = b;
//         return ans;
//     }
// }