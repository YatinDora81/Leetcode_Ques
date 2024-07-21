// // 56. Merge Intervals

// class Solution {
//     public int[][] merge(int[][] arr) {
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> ll = new ArrayList<>();
//         Arrays.sort(arr , (a,b)->{
//             if(a[0]<b[0]) return -1;
//             else if(a[0]>b[0]) return 1;
//             else{
//                 if(a[1]<b[1]) return -1;
//                 else if(a[1]>b[1]) return 1;
//                 return 0;
//             }
//         });
//         ll.add(arr[0][0]);
//         ll.add(arr[0][1]);
//         ans.add(ll);
//         for(int i=1;i<arr.length;i++){
//             if(arr[i][0]<=ans.get(ans.size()-1).get(1)){
//                 ans.get(ans.size()-1).set(1 , Math.max( arr[i][1] , ans.get(ans.size()-1).get(1)) );
//             }
//             else{
//                 ll = new ArrayList<>();
//                 ll.add(arr[i][0]);
//                 ll.add(arr[i][1]);
//                 ans.add(ll);
//             }
//         }
//         int og[][]= new int[ans.size()][2];
//         for(int i=0;i<ans.size();i++){
//             og[i][0] = ans.get(i).get(0);
//             og[i][1] = ans.get(i).get(1);
//         }
//         return og;
//     }
// }