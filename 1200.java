// // 1200. Minimum Absolute Difference

// class Solution {
//     public List<List<Integer>> minimumAbsDifference(int[] arr) {
//         List<List<Integer>> ans=new ArrayList<>();
//         // for(int i=0;i<arr.length;i++){
//         //     if(arr[i]<0) arr[i]=-arr[i];
//         // }

//         Arrays.sort(arr);
//         int mini=Integer.MAX_VALUE;

//         for(int i=1;i<arr.length;i++){
//             mini=Math.min(mini,arr[i]-arr[i-1]);
//         }

//         for(int i=1;i<arr.length;i++){
//             if(arr[i]-arr[i-1] == mini) {
//                 List<Integer> ds=new ArrayList<>();
//                 ds.add(arr[i-1]);
//                 ds.add(arr[i]);
//                 ans.add(ds);
//             }
//         }
//         return ans;
//     }
// 