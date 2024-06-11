// // 1122. Relative Sort Array

// class Solution {
//     public int[] relativeSortArray(int[] arr1, int[] arr2) {
//         int ans[] = new int[arr1.length];
//         int l=0;
//         boolean f[] = new boolean[arr1.length];

//         for(int i=0;i<arr2.length;i++){
//             for(int j=0;j<arr1.length;j++){
//                 if(arr2[i]==arr1[j]){
//                     ans[l] = arr1[j];
//                     l++;
//                     f[j] = true;
//                 }
//             }
//         }
//         List<Integer> ll=new ArrayList<>();
//         for(int i=0;i<f.length;i++){
//             if(f[i]==false){
//                 ll.add(arr1[i]);
//                 f[i] = true;
//             }
//         }

//         Collections.sort(ll);

//         for(int i : ll){
//             ans[l] = i;
//             l++;
//         }

//         return ans;
//     }
// }