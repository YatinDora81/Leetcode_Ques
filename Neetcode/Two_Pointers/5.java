// class Solution {
//     public void merge(int[] nums1, int n, int[] nums2, int m) {
//         int ans[] = new int[n+m];
//         int l = 0 , i = 0 , j = 0;

//         while(i<n && j<m){
//             if(nums1[i]<=nums2[j]) ans[l++] = nums1[i++];
//             else ans[l++] = nums2[j++];
//         }
//         while(i<n) ans[l++] = nums1[i++];
//         while(j<m) ans[l++] = nums2[j++];
//         for(i=0;i<ans.length;i++) nums1[i] = ans[i];
//         return ;
//     }
// }