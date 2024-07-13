// // 2570. Merge Two 2D Arrays by Summing Values

// class Solution {
//     public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
//         TreeMap<Integer,Integer> map = new TreeMap<>();
//         for(int i[] : nums1){
//             if(map.containsKey(i[0])) map.put(i[0] , map.get(i[0])+i[1] );
//             else map.put(i[0],i[1]);
//         }
//         for(int i[] : nums2){
//             if(map.containsKey(i[0])) map.put(i[0] , map.get(i[0])+i[1] );
//             else map.put(i[0],i[1]);
//         }

//         int ans[][]= new int[map.size()][2];
//         int l=0;
//         for(int i : map.keySet()){
//             ans[l][0] = i;
//             ans[l][1] = map.get(i);
//             l++; 
//         }
//         return ans;

//     }
// }