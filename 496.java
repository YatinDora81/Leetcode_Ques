// // 496. Next Greater Element I

// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         HashMap<Integer,Integer> map =new HashMap<>();
//         int pref[]=new int[nums2.length];
//         Stack<Integer> st =new Stack<>();
//         for(int i=nums2.length-1;i>=0;i--){
//             if(st.size()==0) pref[i] = -1;
//             else{
//                 if(nums2[i]<st.peek()){
//                     pref[i] = st.peek();
//                 }
//                 else{
//                     while(st.size()>0 && st.peek()<=nums2[i]) st.pop();
//                     if(st.size()==0) pref[i] = -1;
//                     else pref[i] = st.peek();
//                 }
//             }
//             st.add(nums2[i]);
//         }

//         for(int i=0;i<pref.length;i++){
//             map.put(nums2[i] , pref[i]);
//         }

//         int ans[] =new int[nums1.length];
//         for(int i=0;i<ans.length;i++){
//             ans[i] = map.get(nums1[i]);
//         }

//         return ans;
//     }
// }